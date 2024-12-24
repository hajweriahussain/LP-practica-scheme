// Gramàtica per expressions senzilles
grammar scheme;
root : expressionsBasiques*             // l'etiqueta ja és root
     ;
expressionsBasiques : '(' expressioBasica ')'  # expressioBasiques
     ;

expressioBasica: expressio* ;

expressio: expressionsBasiques
        | NUM 
        | operador
        ;


operador: '+' # Suma
    | '-' # Resta
    |'*' # Multiplicacio
    |'/' # Divisio
    ;

NUM: [0-9]+ ;
WS  : [ \t\n\r]+ -> skip ;