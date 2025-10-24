parser grammar AngularParser;

options { tokenVocab = AngularLexer; }

/* ======================== 1. Program Entry ======================== */
prog
    : (importStatement)* (storeDecl)* componentDecorator Export? Class identifier_ OpenBrace (statement)* CloseBrace EOF
    ;

/* ======================== 2. Import Statements ======================== */
importStatement
    : Import ((OpenBrace identifier_ CloseBrace) | identifier_) From StringLiteral SemiColon?
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
    : Component OpenParen compoenentObject CloseParen
    ;

compoenentObject
    : OpenBrace
      Selector Colon StringLiteral Comma
      Template Colon Backtick html Backtick
      (Comma Styles Colon Backtick styles Backtick)?
      CloseBrace
    ;

/* ======================== 5. Class Body Statements ======================== */
statement
    : (block | decl | expr | loops | if | constructor | consoleLog | arrayDeclaration) SemiColon?
    ;

block
    : OpenBrace statement* CloseBrace
    ;

loops
    : (for | while | do)
    ;

if
    : If OpenParen expr+ CloseParen block (Else block)?
    ;

for
    : For OpenParen forParameters CloseParen block
    ;

forParameters
    : variableDecl? SemiColon expr? SemiColon expr?
    ;

while
    : While OpenParen expr CloseParen block
    ;

do
    : Do block While OpenParen expr CloseParen
    ;

consoleLog
    : Console Dot Log OpenParen expr CloseParen
    ;

arrayDeclaration
    : identifier_ Assign arrayLiteral
    ;

/* ======================== 6. Variable & Type Declarations ======================== */
decl
    : variableDecl
    | variableTypeDecl
    | normalFunctionDecleration
    ;

variableDecl
    : (Var | Let | Const) identifier_ Assign (anyLiteral | expr)
    ;

variableTypeDecl
  : identifier_ Colon dataTypes (OpenBracket CloseBracket)? Assign (anyLiteral | expr)
  ;

dataTypes
    : (Number | String | Boolean | Any)
    ;

/* ======================== 7. Expressions & Initialization ======================== */
initialize
    : identifier_ Assign (expr | anyLiteral)
    ;

expr
    : functionCall
    | arrayLiteral
    | objectLiteral
    | arrowFunctionDecleration
    | StringLiteral
    | arithmeticExpr
    | expr PlusPlus
    | expr MinusMinus
    | initialize
    | return
    | Break
    | Continue
    | identifier_
    ;

return
    : Return expr?
    ;

/* ======================== 8. Arithmetic Expressions ======================== */
arithmeticExpr
    : arithmeticExpr operartor arithmeticExpr
    | DecimalLiteral
    | StringLiteral
    | identifier_
    ;

operartor
    : Multiply | Divide | Plus | Minus | MultiplyAssign | DivideAssign | ModulusAssign
    | PlusAssign | MinusAssign | And | Or | Equals_ | NotEquals | IdentityEquals | IdentityNotEquals
    | LessThan | MoreThan | LessThanEquals | GreaterThanEquals | BitAnd | BitXOr | BitOr
    | Assign | Modulus | Dot
    ;

/* ======================== 9. Identifiers & Indexing ======================== */
identifier_
    : Identifier arrayIndex?
    ;

arrayIndex
    : OpenBracket expr (Comma expr )* CloseBracket
    ;

/* ======================== 10. Literals ======================== */
anyLiteral
    : arrayLiteral
    | objectLiteral
    | StringLiteral
    | BooleanLiteral
    | DecimalLiteral
    | NullLiteral
    ;

arrayLiteral
    : OpenBracket arrayList CloseBracket
    ;

arrayList
    : arrayElement? (Comma arrayElement)*
    ;

arrayElement
    : anyLiteral
    | expr
    | identifier_
    ;

objectLiteral
    : OpenBrace objectBody CloseBrace
    ;

objectBody
    : objectKeyValue? (Comma objectKeyValue)*
    ;

objectKeyValue
    : (Identifier | StringLiteral | DecimalLiteral) Colon expr
    ;

/* ======================== 11. Function Declarations ======================== */
functionDecl
    : normalFunctionDecleration
    | arrowFunctionDecleration
    ;

normalFunctionDecleration
    : identifier_ functionParameters functionBody
    ;

arrowFunctionDecleration
    : functionParameters Arrow functionBody
    ;

functionBody
    : block
    ;

functionParameters
    : OpenParen (variableFunctionSingleArgument? (Comma variableFunctionSingleArgument)*) CloseParen
    ;

variableFunctionSingleArgument
    : identifier_ (Colon dataTypes (OpenBracket CloseBracket)? )?
    ;

/* ======================== 12. Injectable Constructor Parameters ======================== */
constructor
    : Constructor injectableFunctionParameters block
    ;

injectableFunctionParameters
    : OpenParen (injectableVariableFunctionSingleArgument? (Comma+ injectableVariableFunctionSingleArgument)*)? CloseParen
    ;

injectableVariableFunctionSingleArgument
    : accessModifires identifier_ Colon dataTypes
    ;

accessModifires
    : Public
    | Private
    | Protected
    ;

/* ======================== 13. HTML & Interpolation ======================== */
html
    : (htmlContent)*
    ;

htmlContent
    : htmlElement
    | interpolation
    | textContent
    | Identifier
    ;

interpolation
    : OpenBrace OpenBrace interpolationValue CloseBrace CloseBrace
    ;

interpolationValue
    : identifierPath
    | identifier_
    ;

identifierPath
    : identifier_ (Dot identifier_)*
    ;

textContent
    : ~(LessThan | OpenBrace | CloseBrace)+
    ;

/* ======================== 14. HTML Elements & Bindings ======================== */
htmlElement
    : selfClosingTag
    | openTag (htmlContent)* closeTag
    ;

htmlTag
    : Identifier
    ;

openTag
    : LessThan htmlTag (structuralDirectives)? (boundAttribute | attribute | eventBinding)* MoreThan
    ;

selfClosingTag
    : LessThan htmlTag (structuralDirectives)? (boundAttribute | attribute | eventBinding)* Divide MoreThan
    ;

closeTag
    : LessThan Divide htmlTag MoreThan
    ;

structuralDirectives
    : forDirective
    | ifDirective
    ;

forDirective
    : NgFor Assign StringLiteral  // دعم الـ quotes
    | NgFor Assign Let identifier_ Of identifier_  // دعم بدون quotes
    ;

ifDirective
    : NgIf Assign StringLiteral
    | NgIf Assign (identifier_ | anyLiteral)
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

// ========== التعديل الرئيسي: إصلاح الـ Property Binding ==========
boundAttribute
    : OpenBracket attributeName CloseBracket Assign StringLiteral
    | OpenBracket attributeName CloseBracket Assign identifierPath
    ;

eventName
    : Identifier
    ;

// ========== التعديل الرئيسي: إصلاح الـ Event Binding ==========
eventBinding
    : OpenParen eventName CloseParen Assign StringLiteral
    | OpenParen eventName CloseParen Assign functionCall
    ;

/* ======================== 15. Function Calls ======================== */
functionCall
    : (identifierPath | Select | Dispatch) OpenParen (expr (Comma expr)*)? CloseParen
    ;

/* ======================== 16. CSS Styles ======================== */
styles
    : (cssRule | cssDeclaration)*
    ;

cssRule
    : Identifier OpenBrace cssDeclaration* CloseBrace
    ;

cssDeclaration
    : Identifier Colon propertyValue SemiColon?
    ;

propertyValue
    : (StringLiteral | DecimalLiteral | HexColorLiteral | CssUnit | identifierPath | cssBasicColor)+
    ;

cssBasicColor
    : CssColor
    ;