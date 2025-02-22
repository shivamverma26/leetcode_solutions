# Write your MySQL query statement below
SELECT EMAIL
FROM Person
GROUP BY EMAIL
HAVING COUNT(EMAIL)>1
