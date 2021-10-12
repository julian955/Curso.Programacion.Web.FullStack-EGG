SELECT* FROM departamentos;
SELECT* FROM empleados;
SELECT nombre_depto FROM departamentos;
SELECT nombre,sal_emp FROM empleados;
SELECT comision_emp FROM empleados;
SELECT*FROM empleados WHERE cargo_emp = 'Secretaria';
SELECT*FROM empleados WHERE cargo_emp = 'vendedor';
SELECT nombre FROM empleados
ORDER BY nombre;
SELECT nombre,cargo_emp FROM empleados
ORDER BY sal_emp DESC;
SELECT nombre AS Nombre, cargo_emp AS Cargo FROM empleados;
SELECT sal_emp,comision_emp FROM empleados WHERE id_depto = 2000
ORDER BY sal_emp;
SELECT nombre,(sal_emp + comision_emp + 300) FROM empleados WHERE id_depto = 3000
ORDER BY nombre;
SELECT nombre FROM empleados WHERE nombre LIKE 'j%';
SELECT nombre,sal_emp,comision_emp,(sal_emp + comision_emp) FROM empleados WHERE comision_emp > 1000
ORDER BY comision_emp;
SELECT nombre,sal_emp,comision_emp,(sal_emp + comision_emp) FROM empleados WHERE comision_emp = 0
ORDER BY comision_emp;
SELECT nombre,sal_emp,comision_emp,(sal_emp + comision_emp) FROM empleados WHERE comision_emp > sal_emp
ORDER BY comision_emp;
SELECT nombre,sal_emp,comision_emp,(sal_emp + comision_emp) FROM empleados WHERE comision_emp <= (sal_emp*0.3)
ORDER BY comision_emp;
SELECT nombre FROM empleados WHERE NOT nombre   LIKE  '%ma%' ORDER BY nombre;
SELECT nombre_depto FROM departamentos WHERE nombre_depto = 'ventas' OR nombre_depto = 'investigacion' OR nombre_depto = 'mantenimiento' ;
SELECT nombre_depto FROM departamentos WHERE  nombre_depto <> 'ventas' AND nombre_depto != 'investigacion' AND  nombre_depto != 'mantenimiento' ;
SELECT nombre,MAX(sal_emp) FROM empleados;
SELECT nombre,sal_emp FROM empleados ORDER BY nombre DESC LIMIT 1;
SELECT MAX(sal_emp),MIN(sal_emp),(MAX(sal_emp) - MIN(sal_emp)) AS Diferencia FROM empleados;
SELECT id_depto,AVG(sal_emp) AS 'Salario Promedio' from empleados GROUP BY id_depto;
SELECT COUNT(id_depto) AS 'Cantidad Emp',id_depto FROM empleados GROUP BY id_depto HAVING COUNT(id_depto) > 3;
SELECT nombre,cargo_emp,COUNT(id_depto) AS 'Cantidad Emp' FROM empleados GROUP BY id_depto HAVING cargo_emp LIKE '%Jefe%' AND COUNT(id_depto) >= 3;
SELECT id_depto,COUNT(id_depto) AS 'Cantidad Emp' FROM empleados GROUP BY id_depto HAVING COUNT(id_depto) = 1;
SELECT id_depto,COUNT(id_depto) AS 'Cantidad Emp' FROM empleados GROUP BY id_depto;
SELECT AVG(empleados.sal_emp) FROM empleados;
SELECT nombre,sal_emp FROM empleados WHERE sal_emp > (SELECT AVG(empleados.sal_emp) FROM empleados);



/*
SELECT sal_emp,comision_emp FROM empleados WHERE id_depto = 2000 ORDER BY comision_emp;
SELECT nombre,(sal_emp + comision_emp+ 500) AS TOTAL FROM empleados WHERE id_depto = 3000 ORDER BY nombre;
SELECT nombre FROM empleados WHERE nombre LIKE 'j%';
SELECT nombre,sal_emp,comision_emp,(sal_emp + comision_emp) AS TOTAL FROM empleados WHERE comision_emp > 1000 ORDER BY nombre;
SELECT nombre,sal_emp,comision_emp,(sal_emp + comision_emp) AS TOTAL FROM empleados WHERE comision_emp = 0 OR comision_emp = NULL ORDER BY nombre;
*/

