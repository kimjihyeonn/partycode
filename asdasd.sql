select SYS_CONNECT_BY_PATH(dgt,'=>')
,LPAD(' ', (LEVEL-1)*6)||'|-'||dgt
,level
from HIR_TST
connect by prior dgt = pdgt
start with dgt= 2;


select SYS_CONNECT_BY_PATH(dgt,'=>')
,LPAD(' ', (LEVEL-1)*6)||'|-'||dgt
,level
from HIR_TST
connect by dgt =prior  pdgt
start with dgt in (5,6);

create table ab_hit_tst as
select *
from hir_tst;

insert into ab_hit_tst values(10,11);

select SYS_CONNECT_BY_PATH(dgt,'=>')
,LPAD(' ', (LEVEL-1)*6)||'|-'||dgt
,level
,connect_by_iscycle cyc
from ab_hit_tst
connect by NOCYCLE prior dgt =  pdgt
start with dgt= 1;


select *from dual

connect by prior :dd=:df
start with level=:dd;
