CREATE DATABASE Human_Friends;
USE Human_Friends;

CREATE TABLE pets
(
	`id` INT AUTO_INCREMENT PRIMARY KEY,
    `animal` VARCHAR(45),
    `name` VARCHAR(45),
    `commands` VARCHAR(45),
    `date of birth` DATE
);

INSERT INTO pets(`animal`,`name`,`commands`,`date of birth`)
VALUES
('Пес','Сантьяго','Дает лапу','2021-01-15'),
('Пес','Мухтар','Кушает по команде','2020-08-30'),
('Пес','Стич','ФАС','2018-12-29'),
('Пес','Самсон','Зайчик','2021-01-12'),
('Пес','Спайк','Голос','2019-07-22'),
('Кошка','Соня','Мяукать','2015-03-25'),
('Кошка','Клеопатра','Спать','2012-05-28'),
('Кошка','Матильда','Танцевать','2020-08-22'),
('Кошка','Кнопка','Высоко прыгает','2012-07-19'),
('Кот','Гарфилд','Очень много есть','2015-10-21'),
('Кот','Том','Выживаемость +100500','2017-11-28'),
('Хомяк','Блэк','Ест кукурузу','2012-05-28'),
('Хомяк','Стич','Бешает в колесе','2018-12-29'),
('Хомяк','Самсон','Кувыркается','2021-01-12'),
('Хомяк','Старк','Лазает по веревке','2020-12-20');

SELECT * FROM pets;


SELECT * FROM pack_animals;

SELECT * FROM pack_animals
WHERE animal NOT IN("Верблюд");

CREATE TABLE Horses
(
	`id` INT AUTO_INCREMENT PRIMARY KEY,
    `animal` VARCHAR(45),
    `name` VARCHAR(45),
    `commands` VARCHAR(45),
    `date of birth` DATE
);
INSERT INTO Horses(`animal`,`name`,`commands`,`date of birth`)
VALUES
('Лошадь','Апполон','Группа, марш','2016-11-23'),
('Лошадь','Астон','Рысью, марш','2014-01-23'),
('Лошадь','Адонис','Короткой рысью, марш','2017-07-13'),
('Лошадь','Буран','Группа, стой','2012-11-27');

CREATE TABLE Camels
(
	`id` INT AUTO_INCREMENT PRIMARY KEY,
    `animal` VARCHAR(45),
    `name` VARCHAR(45),
    `commands` VARCHAR(45),
    `date of birth` DATE
);
INSERT INTO Camels(`animal`,`name`,`commands`,`date of birth`)
VALUES
('Верблюд','Агата','ГИТ','2011-10-21'),
('Верблюд','Ида','ДУРР','2014-01-11'),
('Верблюд','Твист','КАШ','2014-11-03'),
('Верблюд','Джаред','КХХ-КХХ','2019-10-30');

CREATE TABLE Camels
(
	`id` INT AUTO_INCREMENT PRIMARY KEY,
    `animal` VARCHAR(45),
    `name` VARCHAR(45),
    `commands` VARCHAR(45),
    `date of birth` DATE
);
INSERT INTO Camels(`animal`,`name`,`commands`,`date of birth`)
VALUES
('Верблюд','Агата','ГИТ','2011-10-21'),
('Верблюд','Ида','ДУРР','2014-01-11'),
('Верблюд','Твист','КАШ','2014-11-03'),
('Верблюд','Джаред','КХХ-КХХ','2019-10-30');

CREATE TABLE Donkeys
(
	`id` INT AUTO_INCREMENT PRIMARY KEY,
    `animal` VARCHAR(45),
    `name` VARCHAR(45),
    `commands` VARCHAR(45),
    `date of birth` DATE
);
INSERT INTO Donkeys(`animal`,`name`,`commands`,`date of birth`)
VALUES
('Осел','Дора','ХАП-ХАП-ХАП-ХАП','2018-04-25'),
('Осел','Лейси','ЦОК, ЦОК','2012-08-20'),
('Осел','Софи','ПРРРР','2021-06-17'),
('Осел','Теса','ФФФФ','2014-02-27');

/*
10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку.
Объединить таблицы лошади, и ослы в одну таблицу.
*/
DELETE FROM camels WHERE animal = "Верблюд";  -- Удаление из таблицы верблюдов

SELECT D.`animal`,D.`name`,D.`commands`,D.`date of birth`,H.`animal`,H.`name`,H.`commands`,H.`date of birth`
FROM Donkeys D
JOIN Horses H;

/*
11. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет
и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице
*/
SELECT * ,
Round((YEAR(CURRENT_DATE()) - YEAR(`date of birth`)) + (MONTH(CURRENT_DATE() - MONTH(`date of birth`)))/10, 2) AS age
FROM pets
WHERE Round((YEAR(CURRENT_DATE()) - YEAR(`date of birth`)) + (MONTH(CURRENT_DATE() - MONTH(`date of birth`)))/10, 2) > 1
AND Round((YEAR(CURRENT_DATE()) - YEAR(`date of birth`)) + (MONTH(CURRENT_DATE() - MONTH(`date of birth`)))/10, 2) < 3;