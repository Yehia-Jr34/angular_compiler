parser grammar Parser;

options { tokenVocab = Lexer; }

/* ======================== 1. Program Entry ======================== */
prog
    : (importStatement)* (storeDecl)* componentDecorator Export? Class identifier_ OpenBrace (statement)* CloseBrace EOF
    ;

/* ======================== 2. Import Statements ======================== */
importStatement
    : Import ((OpenBrace identifier_ CloseBrace) | identifier_) From StringLiteral SemiColon? #Import
    ;

/* ======================== 3. State Management ======================== */
storeDecl
    : Store identifier_ OpenBrace storeBody CloseBrace
    ;

storeBody
    : stateSection actionsSection? reducerSection? selectorsSection?
    ;

stateSection
    : State OpenBrace storeStateField (Comma storeStateField)* CloseBrace
    ;

storeStateField
    : identifier_ (Colon | Assign) (anyLiteral | expr)
    ;

actionsSection
    : Actions OpenBrace actionDecl* CloseBrace
    ;

actionDecl
    : identifier_ Assign arrowFunctionDecleration SemiColon?
    ;

reducerSection
    : Reducer OpenBrace reducerRule* CloseBrace
    ;

reducerRule
    : identifier_ Colon arrowFunctionDecleration SemiColon?
    ;

selectorsSection
    : Selectors OpenBrace selectorDecl+ CloseBrace
    ;

selectorDecl
    : identifier_ Assign arrowFunctionDecleration SemiColon?
    ;

/* ======================== 4. Component Declaration ======================== */
componentDecorator
    : identifier_ OpenParen compoenentObject CloseParen #ComponentDecoratorStmt
    ;

compoenentObject
    : OpenBrace Selector Colon StringLiteral Comma Template Colon html CloseBrace #Componentobj
    ;

/* ======================== 5. Class Body Statements ======================== */
statement
    : (block | decl | expr | loops | if | constructor | consoleLog) SemiColon? #StatementStmt
    ;

block
    : OpenBrace statement* CloseBrace #BlockStmt
    ;

loops
    : (for | while | do)
    ;

if
    : If OpenParen expr+ CloseParen statement (Else statement)* #IfStmt
    ;

for
    : For OpenParen forParameters CloseParen block #ForStmt
    ;

forParameters
    : variableDecl? SemiColon expr? SemiColon expr? #Forpara
    ;

while
    : While OpenParen expr+ CloseParen block #WhileStmt
    ;

do
    : Do block while #DoStmt
    ;

consoleLog
    : Console Dot Log OpenParen expr CloseParen #ConsoleLogStmt
    ;

/* ======================== 6. Variable & Type Declarations ======================== */
decl
    : variableDecl                  #VariableDecla
    | variableTypeDecl              #VariableTypeDecla
    | normalFunctionDecleration     #NormalFunction
    ;

variableDecl
    : declTypes identifier_ Assign (anyLiteral | expr)
    ;

declTypes
    : (Var | Let | Const) #Decltype
    ;

variableTypeDecl
  : identifier_ Colon dataTypes (OpenBracket CloseBracket)? Assign (anyLiteral | expr)
  ;

dataTypes
    : (Number | String | Boolean | Any) #DataTypesStmt
    ;

/* ======================== 7. Expressions & Initialization ======================== */
initialize
    : identifier_ Assign (expr | anyLiteral) #Int
    ;

expr
    : functionCall                 #FunccallExpr
    | arrayLiteral                 #ArrliteralExpr
    | objectLiteral                #ObjliteralExpr
    | arrowFunctionDecleration     #Arrfundec
    | StringLiteral                #Strliteral
    | arithmeticExpr               #Arthexp
    | expr PlusPlus                #Plusplus
    | expr MinusMinus              #Minusminus
    | initialize                   #Intialize
    | return                       #Ret
    | Break                        #Break
    | Continue                     #Continue
    | identifier_                  #Identi
    ;

return
    : Return expr? #ReturnStmt
    ;

/* ======================== 8. Arithmetic Expressions ======================== */
arithmeticExpr
    : arithmeticExpr operartor arithmeticExpr #Arthimaticexpr
    | DecimalLiteral                          #Decllit
    | StringLiteral                           #Strlit
    | identifier_                             #Iden
    ;

operartor
    : Multiply | Divide | Plus | Minus | MultiplyAssign | DivideAssign | ModulusAssign
    | PlusAssign | MinusAssign | And | Or | Equals_ | NotEquals | IdentityEquals | IdentityNotEquals
    | LessThan | MoreThan | LessThanEquals | GreaterThanEquals | BitAnd | BitXOr | BitOr
    | Assign | Modulus | Dot
    ;

/* ======================== 9. Identifiers & Indexing ======================== */
identifier_
    : Identifier arrayIndex? #Identifier__
    ;

arrayIndex
    : OpenBracket expr CloseBracket #ArrayIndexStmt
    ;

/* ======================== 10. Literals ======================== */
anyLiteral
    : arrayLiteral   #Arraylit
    | objectLiteral  #Objectlit
    | StringLiteral  #Stringlit
    | BooleanLiteral #Booleanlet
    | DecimalLiteral #Decimallit
    | NullLiteral    #Nulllet
    ;

arrayLiteral
    : OpenBracket arrayList CloseBracket #ArrayLiteralStmt
    ;

arrayList
    : arrayElement? (Comma+ arrayElement)* #ArrayListStmt
    ;

arrayElement
    : anyLiteral   #AnyLiteralStmt
    | expr         #Exper
    | identifier_  #Identifier
    ;

objectLiteral
    : OpenBrace objectBody CloseBrace #ObjectLitStmt
    ;

objectBody
    : objectKeyValue? (Comma objectKeyValue)* #ObjectBodyStmt
    ;

objectKeyValue
    : (Identifier | StringLiteral | DecimalLiteral) Colon expr #ObjectKeyValueStmt
    ;

/* ======================== 11. Function Declarations ======================== */
functionDecl
    : normalFunctionDecleration #Normalfuncdecl
    | arrowFunctionDecleration  #Arrowfuncdecla
    ;

normalFunctionDecleration
    : identifier_ functionParameters functionBody
    ;

arrowFunctionDecleration
    : functionParameters Arrow functionBody
    ;

functionBody
    : block | expr
    ;

functionParameters
    : OpenParen (variableFunctionSingleArgument? (Comma+ variableFunctionSingleArgument)*) CloseParen #Funcpara
    ;

variableFunctionSingleArgument
    : identifier_ (Colon dataTypes (OpenBracket CloseBracket)? )? #Varsingarg
    ;

/* ======================== 12. Injectable Constructor Parameters ======================== */
constructor
    : Constructor injectableFunctionParameters block #ConstructorStmt
    ;

injectableFunctionParameters
    : OpenParen (injectableVariableFunctionSingleArgument? (Comma+ injectableVariableFunctionSingleArgument)*) CloseParen #InjecFuncPara
    ;

injectableVariableFunctionSingleArgument
    : accessModifires identifier_ Colon dataTypes #InjecVarFuncSiArg
    ;

accessModifires
    : Public   #Public
    | Private  #Private
    | Protected#Protocted
    ;

/* ======================== 13. HTML & Interpolation ======================== */
html
    : (htmlContent)* #Htmlcont
    ;

htmlContent
    : htmlElement
    | text
    | (OpenBrace OpenBrace interpolationValue CloseBrace CloseBrace)
    ;

text
    : Identifier #TextStmt
    ;

interpolationValue
    : identifierPath
    | identifier_
    ;

identifierPath
    : identifier_ (Dot identifier_)*
    ;

/* ======================== 14. HTML Elements & Bindings ======================== */
htmlElement
    : selfClosingTag
    | openTag (htmlContent)* closeTag
    ;

htmlTag
    : Identifier #HtmlTagStmt
    ;

openTag
    : LessThan htmlTag structuralDirectives? (boundAttribute | attribute | eventBinding)* MoreThan #OpenTagStmt
    ;

selfClosingTag
    : LessThan Identifier (boundAttribute | attribute | eventBinding)* Divide MoreThan
    ;

closeTag
    : LessThan Divide htmlTag MoreThan #CloseTagStmt
    ;

structuralDirectives
    : forDirective #Ngfor
    | ifDirective  #Ngif
    ;

forDirective
    : NgFor Assign Let identifier_ Of identifier_
    ;

ifDirective
    : NgIf Assign (identifier_ | anyLiteral)
    ;

attribute
    : attributeName Assign attributeValue
    ;

attributeName
    : Identifier
    ;

attributeValue
    : StringLiteral | identifierPath
    ;

boundAttribute
    : OpenBracket attributeName CloseBracket Assign identifierPath
    ;

eventName
    : Identifier
    ;

eventBinding
    : OpenParen eventName CloseParen Assign (functionCall | identifierPath)
    ;

/* ======================== 15. Function Calls ======================== */
functionCall
    : (identifierPath | Select | Dispatch) OpenParen (expr (Comma expr)*)? CloseParen
    ;