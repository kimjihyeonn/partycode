
select SYS_CONNECT_BY_PATH(dgt,'=>')
,LPAD(' ', (LEVEL-1)*6)||'|-'||dgt
,level
from HIR_TST
connect by prior dgt = pdgt
start with dgt= 2;





select
rownum rw
,LTRIM(SYS_CONNECT_BY_PATH(a,'+'),'+') c
from(
SELECT
rownum a
,LAG(rownum) over(order by level) b
from dual
connect by level<=:a)
connect by prior a=b
start with a = :b
where rw=:a-:b+1;




select c from(
select
rownum rw
,LTRIM(SYS_CONNECT_BY_PATH(rw,'+'),'+') c
from(
SELECT
rownum rw
,LAG(rownum) over(order by level) b
from dual
connect by level<=:a)
connect by prior rw=b
start with rw = :b)
where rw=:a-:b+1;



SELECT
rownum rw
,LAG(rownum) over(order by level) b
from dual
connect by level<=:a;


select max(c)||'='||sum(rw) from(
select
decode(LTRIM(SYS_CONNECT_BY_PATH(rw,'+'),'+'),null,0,1) gr
,LTRIM(SYS_CONNECT_BY_PATH(rw,'+'),'+') c
,rw
,connect_by_root rw
from(
SELECT
rownum rw
,LAG(rownum) over(order by level) b
from dual 
connect by level<=:a
)

connect by prior   rw=  b
start with rw = :b
)
group by gr;


select max(d)||'='||sum(rw) from(
select
decode(Ltrim(SYS_CONNECT_BY_PATH(rw,'+'),'+'),null,0,1) gr
,Ltrim(SYS_CONNECT_BY_PATH(rw,'+'),'+') d
,rw from(
select
rw
,b
from(
SELECT
rownum rw
,LAG(rownum) over(order by level) b
from dual 
connect by level<=:a
)
connect by prior  rw=   b
start with rw = :b)
connect by rw= prior b
start with rw = :a
) group by gr;





select max(c)||'='||sum(rw) from(
select
decode(LTRIM(SYS_CONNECT_BY_PATH(rw,'+'),'+'),null,0,1) gr
,LTRIM(SYS_CONNECT_BY_PATH(rw,'+'),'+') c
,rw
from(
SELECT
rownum rw
,LAG(rownum) over(order by level) b
from dual 
connect by level<=:a
)
connect by prior rw= b
start with rw = :b)
group by gr;


select*from T_USER
where sabun = '110';

select *
from 
(select Lpad(' ',(level-1)*6)||'|-'||M_NM
from auth_menu A, menu B
where A.MID = B.MID
connect by  prior A.MID = pmid
and auth_id = :vvvvv
start with auth_id = :vvvvv
and pmid is null) C;



select Lpad(' ',(level-1)*6)||'|-'||M_NM
from auth_menu A, menu B
where A.MID = B.MID
connect by  prior A.MID = pmid
and auth_id = :vvvvv
start with auth_id = :vvvvv
and pmid is null;




SELECT Lpad(' ',(level-1)*6)||'|-'||M_NM
FROM(
select SABUN,NM
,AUTH_NM
,C.MID MID, PMID,DISP_NM,M_NM
from T_USER A, auth B,AUTH_MENU C,MENU D
where A.SABUN ='110'
and A.AUTH_ID = B.AUTH_ID
AND B.AUTH_ID = C.AUTH_ID
AND C.MID = D.MID)
connect by  prior MID = pmid
start with pmid is null;

