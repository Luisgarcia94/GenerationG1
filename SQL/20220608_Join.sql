USE generationg1;

select c.customerNumber, o.orderNumber ,c.customerName 
from customers c, orders o
where c.customerNumber = o.customerNumber 
and c.customerNumber = 496
order by c.customerNumber desc;

SELECT *
FROM customers c
INNER JOIN orders o
ON c.customerNumber = o.customerNumber;