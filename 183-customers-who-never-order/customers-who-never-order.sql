# Write your MySQL query statement below

SELECT name as Customers
FROM ORDERS o
RIGHT JOIN Customers c
ON c.id = o.customerId 
where o.id is null
