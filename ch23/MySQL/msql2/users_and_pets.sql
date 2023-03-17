-- Escribir en la bbdd
INSERT INTO users
(first_name, last_name, fav_food)
VALUES
('Zabdiel', 'Diaz', 'Dragomcitos'),
('Felpe', 'Maqueda', 'Chilaquiles Verdes'),
('Fernando', 'Aguilar', 'Carne Asada'),
('Axel', 'Reynaga', 'mole'),
('Jorge', 'Recillas', 'Torta ahogada'),
('Daniela', 'Ruiz', 'pozole'),
('Jonathan' , 'Dominguez', 'Carne en su jugo'),
('Alejandro','Morales','Chilaquiles');


-- Seleccionar todo de una tabla 
SELECT * FROM users; 
-- Seleccionar solo una columna
SELECT first_name FROM users; 
ALTER TABLE pets
MODIFY idpets INT NOT NULL
AUTO_INCREMENT;
INSERT INTO pets
(first_name, fav_food, type, users_idusers)
VALUES
('Griselo', 'Fresas', 'Nejo', 1),
('Nicky', 'Caldito con tortillitas', 'Doggo', 2),
('Pepperoni', 'Huesitos de manzanas', 'Doggo', 3),
('Pepe', 'Semillas de girasol', 'Cotorro', 3),
('Betty', 'pollo', 'gato', 4),
('Boster', 'jamon', 'doggo', 4),
('Lucifugo', 'Atun', 'Gato', 5),
('Nina', 'Pollito', 'Gathija', 6),
('Toby', 'Croquetas', 'Doggo',7),
('Sasha', 'Tacos', 'Doggo', 8);












ALTER TABLE pets
ADD COLUMN users_idusers INT NOT NULL;
ALTER TABLE pets
ADD CONSTRAINT fk_pets_users
FOREIGN KEY (users_idusers)
REFERENCES users (idusers)
ON DELETE NO ACTION
ON UPDATE NO ACTION;