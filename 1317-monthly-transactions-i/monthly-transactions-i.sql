# Write your MySQL query statement below
select DATE_FORMAT(trans_date, '%Y-%m') AS month,
        t.country as country,
        count(id) as trans_count,
        sum(state = 'approved') as approved_count,
        sum(amount) as trans_total_amount,
        SUM(CASE WHEN state = 'approved' THEN amount ELSE 0 END) AS approved_total_amount         
from Transactions as t
group by t.country, month;