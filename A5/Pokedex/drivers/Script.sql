-- 1. Creació de la base de dades
CREATE DATABASE IF NOT EXISTS concesionarios;
USE concesionarios;

-- 2. Creació de l'usuari i assignació de permisos
-- Substitueix 'la_teva_contrasenya' per la que vulguis utilitzar
CREATE USER IF NOT EXISTS 'adminC'@'localhost' IDENTIFIED BY '123';
GRANT ALL PRIVILEGES ON concesionarios.* TO 'adminC'@'localhost';
FLUSH PRIVILEGES;

-- 3. Creació de la taula 'coches'
-- Nota: El boolean en MySQL es guarda com a TINYINT(1) (0 és false, 1 és true)
CREATE TABLE IF NOT EXISTS coches (
    matricula VARCHAR(15) PRIMARY KEY,
    marca VARCHAR(50) NOT NULL,
    puertas INT,
    automatico TINYINT(1)
);

-- 4. Inserció de registres d'exemple
INSERT INTO coches (matricula, marca, puertas, automatico) VALUES 
('1234ABC', 'Toyota', 5, 1),
('5678DEF', 'Seat', 3, 0),
('9012GHI', 'Tesla', 5, 1),
('3456JKL', 'Volkswagen', 5, 0),
('7890MNP', 'BMW', 4, 1),
('1122BBB', 'Audi', 5, 1),
('3344CCC', 'Ford', 5, 0),
('5566DDD', 'Renault', 3, 0),
('7788FFF', 'Mercedes', 4, 1),
('9900GGG', 'Hyundai', 5, 1),
('1212HHH', 'Kia', 5, 0),
('3434JJJ', 'Peugeot', 5, 0),
('5656KKK', 'Volvo', 5, 1),
('7878LLL', 'Mazda', 3, 0),
('9090MMM', 'Nissan', 5, 1);