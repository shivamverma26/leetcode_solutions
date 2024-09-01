# Write your MySQL query statement below
SELECT 
    s.student_id,
    s.student_name,
    sb.subject_name,
    count(e.subject_name) as attended_exams
FROM Students s
JOIN Subjects sb
LEFT JOIN Examinations e
ON e.subject_name=sb.subject_name
  AND s.student_id=e.student_id
GROUP BY sb.subject_name, s.student_id 
ORDER BY student_id ASC, subject_name ASC
