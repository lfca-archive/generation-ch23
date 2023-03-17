-- USE `business`;

-- Revisar employyee
SELECT * FROM employee;

-- Alias 
SELECT last_name AS 'Apellido' FROM employee;

-- Alias ++
SELECT employee_id AS 'ID',
	first_name AS 'Nombre',
	last_name AS 'Apellido',
	department AS 'Departamento' 
FROM employee;

-- Filtrar por nombre
-- Buscar Monica

SELECT * FROM employee WHERE first_name = 'Monika';

-- Filtrar doble
SELECT * FROM employee
WHERE salary = 500000 AND first_name = 'Vivek';

-- Filtrar por NOT 
SELECT * FROM employee
WHERE NOT first_name = 'Barrack';

-- Filtrar por doble NOT 
SELECT * FROM employee
WHERE NOT first_name = 'Santiago' AND NOT first_name = 'Ian' ;

-- Ordenamiento
-- ORDER BY
-- Default  es orden descendiente DESC y ascendente ASC
SELECT * FROM employee
ORDER BY department ASC;

-- DESC
SELECT * FROM employee
ORDER BY department DESC;

SELECT * FROM employee
ORDER BY department ASC, last_name DESC;


-- GROUP BY  
SELECT * FROM employee
GROUP BY salary;