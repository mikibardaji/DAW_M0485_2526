-- 1. Gestión de Usuario
DROP USER IF EXISTS 'usrmovies'@'localhost';
CREATE USER 'usrmovies'@'localhost' IDENTIFIED BY 'pswmovies';

-- 2. Crear la base de datos (UTF8MB4 es el estándar recomendado)
DROP DATABASE IF EXISTS dbmovies;
CREATE DATABASE dbmovies
  DEFAULT CHARACTER SET utf8mb4
  DEFAULT COLLATE utf8mb4_unicode_ci;

-- 3. Privilegios
GRANT ALL PRIVILEGES ON dbmovies.* TO 'usrmovies'@'localhost';
FLUSH PRIVILEGES;

-- 4. Uso de la base de datos
USE dbmovies;

-- 5. Crear la tabla con tus campos específicos
CREATE TABLE `movies` (
  `codiPel` INT NOT NULL AUTO_INCREMENT,
  `Titol` VARCHAR(100) NOT NULL,
  `genere` VARCHAR(50) DEFAULT NULL,
  `duracion` INT DEFAULT 0,
  `segundaParte` TINYINT(1) DEFAULT 0, -- 0 = No, 1 = Sí
  PRIMARY KEY (`codiPel`)
) ENGINE=InnoDB;

-- 6. Inserción de 40 películas adaptadas
INSERT INTO `movies` (`Titol`, `genere`, `duracion`, `segundaParte`) VALUES
('Inception', 'Sci-Fi', 148, 0),
('The Godfather', 'Crime', 175, 0),
('The Godfather Part II', 'Crime', 202, 1),
('The Dark Knight', 'Action', 152, 1),
('Pulp Fiction', 'Crime', 154, 0),
('The Shawshank Redemption', 'Drama', 142, 0),
('Spider-Man 2', 'Action', 127, 1),
('Aliens', 'Sci-Fi', 137, 1),
('Toy Story 2', 'Animation', 92, 1),
('The Matrix', 'Sci-Fi', 136, 0),
('The Matrix Reloaded', 'Sci-Fi', 138, 1),
('Terminator 2: Judgment Day', 'Action', 137, 1),
('Back to the Future', 'Sci-Fi', 116, 0),
('Back to the Future Part II', 'Sci-Fi', 108, 1),
('Empire Strikes Back', 'Sci-Fi', 124, 1),
('Shrek 2', 'Animation', 93, 1),
('Blade Runner 2049', 'Sci-Fi', 164, 1),
('Kill Bill: Vol. 2', 'Action', 137, 1),
('Mad Max: Fury Road', 'Action', 120, 0),
('The Lord of the Rings: The Two Towers', 'Fantasy', 179, 1),
('John Wick: Chapter 2', 'Action', 122, 1),
('Frozen II', 'Animation', 103, 1),
('Top Gun: Maverick', 'Action', 130, 1),
('Avatar: The Way of Water', 'Sci-Fi', 192, 1),
('Evil Dead II', 'Horror', 84, 1),
('A Quiet Place Part II', 'Horror', 97, 1),
('The Conjuring 2', 'Horror', 134, 1),
('Dawn of the Planet of the Apes', 'Sci-Fi', 130, 1),
('Before Sunset', 'Romance', 80, 1),
('The Bourne Supremacy', 'Action', 108, 1),
('Paddington 2', 'Comedy', 103, 1),
('Despicable Me 2', 'Animation', 98, 1),
('Guardians of the Galaxy Vol. 2', 'Action', 136, 1),
('Spider-Man: Across the Spider-Verse', 'Animation', 140, 1),
('Creed II', 'Drama', 130, 1),
('Halloween (2018)', 'Horror', 106, 1),
('Scream 2', 'Horror', 120, 1),
('Ip Man 2', 'Action', 108, 1),
('Home Alone 2: Lost in New York', 'Comedy', 120, 1),
('Finding Dory', 'Animation', 97, 1);