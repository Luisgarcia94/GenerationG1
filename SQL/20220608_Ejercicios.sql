USE generationg1;

SELECT * FROM customers;

SELECT * FROM customers c
WHERE c.customerName LIKE '%toy%';

SELECT c.customerNumber,c.CustomerName,c.city
FROM customers c
WHERE c.city = 'Madrid';

-- obtener todas las ordenes por cliente
select c.customerNumber, o.orderNumber ,c.customerName, o.status 
from customers c, orders o
where c.customerNumber = o.customerNumber 
AND c.customerNumber = 496
order by c.customerNumber DESC ;    


SELECT p.productName, pl.productLine, p.quantityInStock
FROM products p, productlines pl  
WHERE p.productLine = pl.productLine
AND p.productLine = 'Motorcycles' 
ORDER BY p.quantityInStock DESC;

SELECT p.productName, p.quantityInStock, pl.productLine
FROM products p , productlines pl  
WHERE p.productName LIKE '%Ford%'
And p.productLine = pl.productLine
ORDER BY p.productLine ASC;




