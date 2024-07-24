# Write your MySQL query statement below
select product_name, year, price from Sales as sales left join Product as product on sales.product_id = product.product_id;
