

SELECT
rownum

FROM
dual
start with level=:a
connect by prior level <=:b;



SELECT* from 
HIR_TST;