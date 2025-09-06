lexer grammar Lexer;

OpenParen      : '(' ;
CloseParen     : ')' ;
OpenBracket    : '[' ;
CloseBracket   : ']' ;
OpenBrace      : '{' ;
CloseBrace     : '}' ;
LessThan       : '<' ;
MoreThan       : '>' ;
Divide         : '/' ;
Comma          : ',' ;
SemiColon      : ';' ;
Colon          : ':' ;
Dot            : '.' ;
Assign         : '=' ;
Arrow          : '=>' ;

Import         : 'import' ;
From           : 'from' ;
Export         : 'export' ;
Class          : 'class' ;
Constructor    : 'constructor' ;
Return         : 'return' ;
If             : 'if' ;
Else           : 'else' ;
For            : 'for' ;
While          : 'while' ;
Do             : 'do' ;
Break          : 'break' ;
Continue       : 'continue' ;
Public         : 'public' ;
Private        : 'private' ;
Protected      : 'protected' ;

Var            : 'var' ;
Let            : 'let' ;
Const          : 'const' ;

Number         : 'number' ;
String         : 'string' ;
Boolean        : 'boolean' ;
Any            : 'any' ;

Console        : 'console' ;
Log            : 'log' ;

NgFor          : '*ngFor' ;
NgIf           : '*ngIf' ;

Store          : 'store' ;
State          : 'state' ;
Actions        : 'actions' ;
Reducer        : 'reducer' ;
Selectors      : 'selectors' ;
Select         : 'select' ;
Selector        :'selector';
Template        :'template';
Of              :'of';
Dispatch       : 'dispatch' ;
On             : 'on' ;

MultiplyAssign : '*=' ;
DivideAssign   : '/=' ;
ModulusAssign  : '%=' ;
PlusAssign     : '+=' ;
MinusAssign    : '-=' ;
IdentityEquals : '===' ;
IdentityNotEquals : '!==' ;
Equals_        : '==' ;
NotEquals      : '!=' ;
LessThanEquals : '<=' ;
GreaterThanEquals : '>=' ;
BitAnd         : '&' ;
BitXOr         : '^' ;
BitOr          : '|' ;
Multiply       : '*' ;
Divide_        : '/' -> type(Divide) ;
Plus           : '+' ;
Minus          : '-' ;
Modulus        : '%' ;
And            : '&&' ;
Or             : '||' ;
PlusPlus       : '++' ;
MinusMinus     : '--' ;
LessThanTok    : '<'  -> type(LessThan) ;
MoreThanTok    : '>'  -> type(MoreThan) ;

NullLiteral    : 'null' ;
BooleanLiteral : 'true' | 'false' ;
StringLiteral  : '\'' (~['\\] | '\\' . )* '\''
               | '"'  (~["\\] | '\\' . )* '"'
               ;
DecimalLiteral : [0-9]+ ('.' [0-9]+)? ;

Identifier     : [a-zA-Z_$] [a-zA-Z0-9_$]* ;

WS             : [ \t\r\n]+ -> skip ;
LineComment    : '//' ~[\r\n]* -> skip ;
BlockComment   : '/*' .*? '*/' -> skip ;
