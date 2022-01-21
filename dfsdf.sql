select 
*
from ORDERS;


select* FROM

CUSTOMERS a,
(
select customer_id,count(*) from orders group by customer_id) b
where a.customer_id = b.customer_id(+);