grammar scheme;

LPAREN : '(' ;
RPAREN : ')' ;
DEFINE : 'define' ;
VAR: [a-zA-Z_][a-zA-Z0-9_]* ;
NUM: [0-9]+ ;
OPERATOR: '+' | '-' | '*' | '/' | '<' | '>' | '<=' | '>=' | '=' | '<>';

root
    : expression* EOF
    ;

expression
    : LPAREN DEFINE VAR expression RPAREN                     # DefineVar
    | LPAREN DEFINE LPAREN VAR VAR* RPAREN expression RPAREN  # DefineFunction
    | LPAREN OPERATOR expression+ RPAREN                      # OpExpression
    | LPAREN VAR expression* RPAREN                           # FunctionCall
    | VAR                                                    # Variable
    | NUM                                                    # Number
    ;

WS : [ \t\n\r]+ -> skip ;