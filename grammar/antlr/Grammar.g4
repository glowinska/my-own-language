grammar Grammar;

prog: ( stat? NEWLINE )*
;

stat: READINT ID        #readi
    | READREAL ID       #readr
    | READSTRING ID     #reads
    | ID '=' expr0      #assign
    | PRINT ID          #print
    | PRINT STRING      #prints
;

expr0: expr1            #single0
    | expr1 ADD expr1   #add
;

expr1: expr2            #single1
    | expr2 MULT expr2  #mult
;

expr2: INT              #integer
    | REAL              #real
    | TOINT expr2       #casti
    | TOREAL expr2      #castr
    | '(' expr0 ')'     #exp
;

READINT: 'readi'
;

READREAL: 'readr'
;

READSTRING: 'reads'
;

PRINT: 'print'
;

TOINT: '(int)'
;

TOREAL: '(real)'
;

ID: ('a'..'z'|'A'..'Z')+
;

REAL: '0'..'9'+'.''0'..'9'+
;

INT: '0'..'9'+
;

STRING : '"' ( ~('\\'|'"') )* '"'
;

ADD: '+'
;

MULT: '*'
;

NEWLINE: '\r'? '\n'
;

WS: (' '|'\t')+ { skip(); }
;