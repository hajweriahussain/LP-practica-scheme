grammar scheme;

LPAREN : '(' ;
RPAREN : ')' ;
DEFINE : 'define' ;
IF : 'if' ;
BOOL: '#t' | '#f';
AND: 'and' ;
OR: 'or' ;
NOT: 'not' ;
COND: 'cond' ;
CAR : 'car' ;
CDR : 'cdr';
CONS : 'cons';
NULL : 'null?';
LET: 'let' ;
QUOTE : '\'';
VAR: [a-zA-Z_][a-zA-Z0-9_]* ;
NUM: [0-9]+ ;
STRING: '"' (~["\r\n])* '"';
COMMENT: ';' ~[\r\n]* -> skip;


root
    : statement* EOF
    ;

statement
    : expression                                                 # ExpressionStatement
    | LPAREN DEFINE VAR expression RPAREN                        # DefineVar
    | LPAREN DEFINE LPAREN VAR VAR* RPAREN expression RPAREN     # DefineFunction
    ;

expression
    : LPAREN operation expression+ RPAREN                   # OpExpression
    | LPAREN VAR expression* RPAREN                         # FunctionCall
    | LPAREN IF expression expression expression RPAREN     # IfExpression
    | LPAREN COND condClause+ RPAREN                        # CondExpression
    | LPAREN COND condClause+ RPAREN                        # CondExpression
    | LPAREN CAR expression RPAREN                          # CarFunction
    | LPAREN CDR expression RPAREN                          # CdrFunction
    | LPAREN CONS expression expression RPAREN              # ConsFunction
    | LPAREN NULL expression RPAREN                         # NullFunction
    | QUOTE LPAREN expression* RPAREN                       # ListLiteral
    | LPAREN LET LPAREN letPair+ RPAREN expression RPAREN # LetExpression
    | LPAREN AND expression+ RPAREN                         # AndExpression
    | LPAREN OR expression+ RPAREN                          # OrExpression
    | LPAREN NOT expression RPAREN                          # NotExpression
    | VAR                                                   # Variable
    | STRING                                                 # String
    | BOOL                                                   # Bool
    | NUM                                                   # Number
    ;

condClause: LPAREN expression expression RPAREN            # Cond
    ;

letPair
    : LPAREN VAR expression RPAREN                          # LetBinding
    ;

operation: '+' | '-' | '*' | '/' | '<' | '>' | '<=' | '>=' | '=' | '<>';

WS : [ \t\n\r]+ -> skip ;
