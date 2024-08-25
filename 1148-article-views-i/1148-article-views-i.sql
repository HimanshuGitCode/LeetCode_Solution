# Write your MySQL query statement below

select distinct author_id as id from Views where author_id = viewer_id order by author_id;

#distinct use to remove the duplicate vlaues. 

#order by use to make it into ascending order.

#Alias (as) use to give temprory name to author_id column because column name is author_id but expected output column name is id. 