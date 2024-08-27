# Write your MySQL query statement below

select product_name, s.year , s.price
from sales as s #sales as s
join product as p #product as p
on p.product_id = s.product_id #join both table product id from proudct table and another product id from sales table