SELECT 
    r.contest_id, 
    ROUND(COUNT(DISTINCT r.user_id) * 100.0 / u.total_users, 2) AS percentage
FROM 
    Register r
JOIN 
    (SELECT COUNT(*) AS total_users FROM Users) u
GROUP BY 
    r.contest_id
ORDER BY 
    percentage DESC, 
    r.contest_id ASC;
