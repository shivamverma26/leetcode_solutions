# Write your MySQL query statement below

with cte as (
    Select customer_number , count(order_number) as numOrder
from Orders
group by customer_number
) 
select customer_number
from cte
where numOrder = (select max(numOrder) from cte)
