select name as Customers from customers  left join orders on customers.id=orders.customerId where orders.customerId is Null;
