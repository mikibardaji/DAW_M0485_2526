-- 1. Base de dades i Usuari
CREATE DATABASE IF NOT EXISTS wrestle_db CHARACTER SET utf8mb4;
USE wrestle_db;

CREATE USER IF NOT EXISTS 'gestor_lluita'@'localhost' IDENTIFIED BY 'Password123';
GRANT ALL PRIVILEGES ON wrestle_db.* TO 'gestor_lluita'@'localhost';
FLUSH PRIVILEGES;

-- 2. Taula amb categoria VARCHAR i NOM ÚNIC
DROP TABLE IF EXISTS lluitadors;
CREATE TABLE lluitadors (
    id INT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL UNIQUE,
    pes DECIMAL(5,2) NOT NULL,
    categoria VARCHAR(50) NOT NULL, -- Canviat a VARCHAR i sense CHECK
    victories INT DEFAULT 0,
    total_lluites INT DEFAULT 0,
    CONSTRAINT chk_victories CHECK (victories <= total_lluites)
);

-- 3. Inserció de dades inicials (Categories: Lleuger, Mig, Pesat)
INSERT INTO lluitadors (id, nom, pes, categoria, victories, total_lluites) VALUES
(1, 'Pau "Llamp"', 65.5, 'Lleuger', 10, 12),
(2, 'Marc "Flash"', 68.2, 'Lleuger', 15, 15),
(3, 'Oriol "Tanc"', 110.5, 'Pesat', 20, 25),
(4, 'Jordi "King"', 82.0, 'Mig', 12, 18),
(5, 'Albert "Steel"', 88.5, 'Mig', 5, 10),
(6, 'Joan "Brau"', 95.0, 'Pesat', 18, 20),
(7, 'Sergi "Ancora"', 105.0, 'Pesat', 7, 15),
(8, 'Miquel "Silent"', 69.9, 'Lleuger', 4, 5),
(9, 'Eric "Eagle"', 64.0, 'Lleuger', 9, 10),
(10, 'Ferran "Stone"', 91.5, 'Pesat', 11, 13),
(11, 'Xavi "Shadow"', 72.0, 'Mig', 22, 25),
(12, 'Bernat "Iron"', 83.5, 'Mig', 6, 12),
(13, 'Pol "Cobra"', 76.8, 'Mig', 13, 19),
(14, 'Dani "Viking"', 102.2, 'Pesat', 19, 21),
(15, 'Guillem "Ghost"', 61.5, 'Lleuger', 2, 8),
(16, 'Oscar "Hammer"', 82.1, 'Mig', 16, 24),
(17, 'Victor "Dragon"', 75.5, 'Mig', 8, 8),
(18, 'Manel "Grizzly"', 115.0, 'Pesat', 25, 30),
(19, 'Ivan "Quick"', 63.2, 'Lleuger', 14, 20),
(20, 'Raul "Killer"', 88.0, 'Mig', 21, 23),
(21, 'Borja "Titan"', 99.4, 'Pesat', 12, 17),
(22, 'Iker "Striker"', 76.0, 'Mig', 6, 15),
(23, 'Roger "Wolf"', 69.0, 'Lleuger', 17, 19),
(24, 'Eloi "Arrow"', 64.9, 'Lleuger', 3, 5),
(25, 'Cesc "Bull"', 102.5, 'Pesat', 28, 40),
(26, 'Hugo "Ninja"', 67.2, 'Lleuger', 11, 11),
(27, 'Biel "Wild"', 81.5, 'Mig', 9, 14),
(28, 'Joel "Blade"', 77.0, 'Mig', 15, 20),
(29, 'Lluc "Falcon"', 65.5, 'Lleuger', 6, 12),
(30, 'Toni "Rock"', 108.0, 'Pesat', 35, 45),
(31, 'Santi "Blue"', 68.0, 'Lleuger', 2, 4),
(32, 'Mateo "Fire"', 77.0, 'Mig', 15, 15),
(33, 'Quim "Yellow"', 84.0, 'Mig', 22, 30),
(34, 'Leo "Lion"', 112.5, 'Pesat', 12, 12),
(35, 'Nil "Snake"', 71.0, 'Mig', 4, 6);

-- Generar variants (II)
INSERT INTO lluitadors (id, nom, pes, categoria, victories, total_lluites)
SELECT id + 100, CONCAT(nom, ' II'), pes, categoria, ROUND(victories/1.5), ROUND(total_lluites/1.2) 
FROM lluitadors;

-- Generar variants (Jr.)
INSERT INTO lluitadors (id, nom, pes, categoria, victories, total_lluites)
SELECT id + 200, CONCAT(nom, ' Jr.'), pes - 0.5, categoria, 1, 2 
FROM lluitadors 
WHERE id <= 35;
