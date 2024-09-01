# Write your MySQL query statement below
SELECT a.machine_id,
ROUND(AVG(b.timestamp-a.timestamp),3) as processing_time
FROM Activity a
JOIN Activity b
ON a.machine_id=b.machine_id
    AND a.process_id=b.process_id
    AND b.timestamp>a.timestamp
    group by a.machine_id;