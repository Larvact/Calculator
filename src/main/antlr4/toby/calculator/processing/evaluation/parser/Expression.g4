grammar Expression;

prog:   stat+ ;

stat:   expr                  # calcExpr;

expr:   expr op='×' expr      # Mult
    |   expr op='÷' expr      # Div
    |   expr op='+' expr      # Add
    |   expr op='-' expr      # Sub
    |   INT                   # int
    |   ID                    # id
    |   '(' expr ')'          # parens
    ;

MULT :  '×' ;
DIV :   '÷' ;
ADD :   '+' ;
SUB :   '-' ;
ID  :   [a-zA-Z]+ ;
INT :   [0-9]+ ;