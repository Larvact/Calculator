grammar Expression;

prog:   stat+ ;

stat:   expr                  # calcExpr;

expr:   expr op='×' expr      # Mult
    |   expr op='÷' expr      # Div
    |   expr op='+' expr      # Add
    |   expr op='-' expr      # Sub
    |   NUMBER                # num
    |   ID                    # id
    |   '(' expr ')'          # parens
    ;

MULT :  '×' ;
DIV :   '÷' ;
ADD :   '+' ;
SUB :   '-' ;
ID  :   [a-zA-Z]+ ;
NUMBER :  '-'? [0-9]+ ('.' [0-9]+)?;