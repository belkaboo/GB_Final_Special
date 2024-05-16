CREATE DATABASE HumanFriends;
USE HumanFriends;

DROP TABLE IF EXISTS Animals;
create table Animals(
	id INT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(50) NOT NULL
);

Insert INTO Animals (type)
	VALUES 
	('Pets'),
	('PackAnimals');

select * from Animals;

DROP TABLE IF EXISTS Pets;

CREATE TABLE PETS (
	id INT AUTO_INCREMENT PRIMARY KEY,
    type_id INT NOT NULL,
	FOREIGN KEY (type_id) REFERENCES Animals (id),
	genus_animal VARCHAR(50) NOT NULL
);

INSERT INTO PETS(type_id, genus_animal)
	VALUES
	(1,'Dogs'),
	(1,'Cats'),
	(1,'Hamsters');

select * from pets;

DROP TABLE IF EXISTS PackAnimals;
CREATE TABLE PackAnimals (
	id INT AUTO_INCREMENT PRIMARY KEY,
    type_id INT NOT NULL,
    FOREIGN KEY (type_id) REFERENCES Animals (id),
	genus_animal VARCHAR(50) NOT NULL
);

INSERT INTO PackAnimals(type_id, genus_animal)
	VALUES
	(2,'Horses'),
	(2,'Camels'),
	(2,'Donkeys');


CREATE TABLE Dogs (       
    id INT AUTO_INCREMENT PRIMARY KEY,
    genus_id INT NOT NULL,
    FOREIGN KEY (genus_id) REFERENCES Pets (id),
    name VARCHAR(20), 
    birthdate DATE,
    commands VARCHAR(50)
);

CREATE TABLE Cats (       
    id INT AUTO_INCREMENT PRIMARY KEY,
    genus_id INT NOT NULL,
    FOREIGN KEY (genus_id) REFERENCES Pets (id),
    name VARCHAR(20), 
    birthdate DATE,
    commands VARCHAR(50)
);

CREATE TABLE Hamsters (       
    id INT AUTO_INCREMENT PRIMARY KEY,
    genus_id INT NOT NULL,
    FOREIGN KEY (genus_id) REFERENCES Pets (id),
    name VARCHAR(20), 
    birthdate DATE,
    commands VARCHAR(50)
);

CREATE TABLE Horses (       
    id INT AUTO_INCREMENT PRIMARY KEY,
    genus_id INT NOT NULL,
    FOREIGN KEY (genus_id) REFERENCES PackAnimals (id),
    name VARCHAR(20), 
    birthdate DATE,
    commands VARCHAR(50)
);

CREATE TABLE Camels (       
    id INT AUTO_INCREMENT PRIMARY KEY,
    genus_id INT NOT NULL,
    FOREIGN KEY (genus_id) REFERENCES PackAnimals (id),
    name VARCHAR(20), 
    birthdate DATE,
    commands VARCHAR(50)
);

CREATE TABLE Donkeys (       
    id INT AUTO_INCREMENT PRIMARY KEY,
    genus_id INT NOT NULL,
    FOREIGN KEY (genus_id) REFERENCES PackAnimals (id),
    name VARCHAR(20), 
    birthdate DATE,
    commands VARCHAR(50)
);

INSERT INTO Cats (genus_id, name, birthdate, commands)
	VALUES
	(2,'Kitty_1','2024-01-01','comand_1'),
	(2,'Kitty_3','2015-12-12','comand_23'),
	(2,'Kitty_2','2022-01-01','comand_23'),
	(2,'Kitty_4','2023-01-11','comand_34');

INSERT INTO Dogs (genus_id, name, birthdate, commands)
	VALUES
	(1,'Dog_1','2024-01-01','comand_1'),
	(1,'Dog_2','2015-12-12','comand_23'),
	(1,'Doggy_doggy_2','2020-01-01','auf auf'),
	(1,'Snoop Doggy Dogg','1971-10-20','Puff Puff');

INSERT INTO Hamsters (genus_id, name, birthdate, commands)
	VALUES
	(3,'Elvin','2013-10-01','sing'),
	(3,'Simon','2013-12-12','run'),
	(3,'Teodor','2014-01-01','eat it');
    
    
----------------

INSERT INTO Horses (genus_id, name, birthdate, commands)
	VALUES
	(1,'Flash','2000-10-01','hop'),
	(1,'Fire','2013-12-12','hop hop hop'),
	(1,'Teodor','2020-09-01','stop, hop, hop hop');
    
INSERT INTO Camels (genus_id, name, birthdate, commands)
	VALUES
	(2,'Camel_1','1990-10-01','sing'),
	(2,'Camel_100','2000-12-13','run'),
	(2,'Camel_777','1999-01-20','eat it');
    
INSERT INTO Donkeys (genus_id, name, birthdate, commands)
	VALUES
	(3,'Egor','2020-10-01','egor davay'),
	(3,'Oleg','2000-03-12','super Oleg'),
	(3,'Vasya','1950-12-20','Konecno Vasya');

DROP TABLE Camels;

CREATE TABLE AllPackAnimals(
id INT AUTO_INCREMENT PRIMARY KEY)
AS(SELECT name, birthdate, commands FROM Horses
UNION SELECT name, birthdate, commands FROM donkeys);


select * from allpackanimals;

DROP TABLE IF EXISTS YoungAnimals;



CREATE TEMPORARY TABLE all_animals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    genus_id INT NOT NULL,
    name VARCHAR(50) NOT NULL,
    birthdate DATE NOT NULL,
    commands TEXT
);

INSERT INTO all_animals (genus_id, name, birthdate, commands)
SELECT genus_id, name, birthdate, commands
FROM cats;

INSERT INTO all_animals (genus_id, name, birthdate, commands)
SELECT genus_id, name, birthdate, commands
FROM dogs;

INSERT INTO all_animals (genus_id, name, birthdate, commands)
SELECT genus_id, name, birthdate, commands
FROM hamsters;

INSERT INTO all_animals (genus_id, name, birthdate, commands)
SELECT genus_id, name, birthdate, commands
FROM horses;

INSERT INTO all_animals (genus_id, name, birthdate, commands)
SELECT genus_id, name, birthdate, commands
FROM donkeys;


CREATE TABLE younganimals AS
SELECT
    id,
    genus_id,
    name,
    birthdate,
    commands,
    TIMESTAMPDIFF(MONTH, birthdate, CURDATE()) AS age_in_months FROM all_animals
	WHERE birthdate BETWEEN CURDATE() - INTERVAL 3 YEAR AND CURDATE() - INTERVAL 1 YEAR;

select * from younganimals;
