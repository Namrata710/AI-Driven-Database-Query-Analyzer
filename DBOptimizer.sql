CREATE DATABASE ai_db_optimizer1;
USE ai_db_optimizer1;

CREATE TABLE students1 (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    age INT
);

INSERT INTO students(name,department,age) VALUES
('Aman','CS',21),
('Riya','IT',22),
('Neha','CS',20),
('Raj','ECE',23),
('Simran','IT',21);