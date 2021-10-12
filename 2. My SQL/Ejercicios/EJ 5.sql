SELECT * FROM oficina;
SELECT * FROM empleado;
SELECT * FROM cliente;
SELECT * FROM pedido;
SELECT * FROM detalle_pedido;
SELECT * FROM gama_producto;
SELECT * FROM pago;
SELECT * FROM producto;

SELECT codigo_oficina,ciudad FROM oficina;
SELECT ciudad,telefono,pais FROM oficina WHERE pais = 'españa';
SELECT nombre,apellido1,apellido2,email,codigo_jefe FROM empleado WHERE codigo_jefe = 7;
SELECT nombre,apellido1,apellido2,email,codigo_jefe,puesto FROM empleado WHERE codigo_jefe IS NULL;
SELECT nombre,apellido1,apellido2,puesto FROM empleado WHERE puesto != 'representante ventas';
SELECT nombre_cliente,pais FROM cliente WHERE pais = 'spain' ORDER BY nombre_cliente;
SELECT estado FROM pedido GROUP BY estado;
SELECT  codigo_cliente ,fecha_pago FROM pago WHERE  YEAR(fecha_pago) = 2008;
SELECT  codigo_cliente ,fecha_pago FROM pago WHERE  DATE_FORMAT(fecha_pago,'%Y') = 2008;
/*SELECT  codigo_cliente ,fecha_pago FROM pago WHERE fecha_pago = 2008;     */
SELECT codigo_pedido,codigo_cliente,fecha_esperada,fecha_entrega FROM pedido WHERE DATE_FORMAT(fecha_entrega,'%d/%m/%Y')> DATE_FORMAT(fecha_esperada, '%d/%m/%Y'); 
SELECT codigo_pedido,codigo_cliente,fecha_esperada,fecha_entrega FROM pedido WHERE  DATE_FORMAT(fecha_entrega,'%d/%m/%Y')<= DATE_FORMAT(fecha_esperada, '%d/%m/%Y') OR ISNULL(fecha_entrega);  
SELECT codigo_pedido,codigo_cliente,fecha_esperada,fecha_entrega FROM pedido WHERE ADDDATE(fecha_entrega, INTERVAL 2 DAY) = fecha_esperada;
SELECT codigo_pedido,codigo_cliente,fecha_esperada,fecha_entrega FROM pedido WHERE DATEDIFF(fecha_esperada,fecha_entrega ) >= 2;
SELECT * FROM pedido WHERE estado = "rechazado" AND YEAR(fecha_pedido) = 2009;
SELECT * FROM pedido WHERE estado = "entregado" AND MONTH(fecha_pedido) = 01;
SELECT * FROM pago WHERE forma_pago = 'paypal' AND YEAR(fecha_pago) = 2008 ORDER BY total;
SELECT forma_pago FROM pago GROUP BY forma_pago;
SELECT * FROM producto WHERE gama = 'ornamentales' AND cantidad_en_stock > 100 ORDER BY precio_venta DESC;
SELECT * FROM cliente WHERE ciudad = 'madrid' AND (codigo_empleado_rep_ventas = 11 OR codigo_empleado_rep_ventas = 30);

