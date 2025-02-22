# Write your MySQL query statement below

-- SELECT name as Customers
-- FROM ORDERS o
-- RIGHT JOIN Customers c
-- ON c.id = o.customerId 
-- where o.id is null

SELECT c.name AS Customers
FROM Customers c
WHERE c.id NOT IN
(
SELECT c.id
FROM Customers c
INNER JOIN Orders o
ON c.id = o.customerId
)
