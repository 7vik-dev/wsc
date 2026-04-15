CREATE DATABASE Students;

USE Students;

CREATE TABLE Student (
 ID INT PRIMARY KEY,
 Name VARCHAR(20),
 Course VARCHAR(20)
);

INSERT INTO Student VALUES (1, 'Durga Prasad', 'Cyber Security');
INSERT INTO Student VALUES (2, 'Shiva Kumar', 'Cyber Security');

SELECT * FROM Student;
