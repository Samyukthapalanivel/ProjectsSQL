create database students
use students
CREATE TABLE Stud(
RollNo INT PRIMARY KEY,
SName VARCHAR(45),
Age INT ,
Gender VARCHAR(10),
Course VARCHAR(50)
);

SELECT * FROM Stud;
INSERT INTO Stud(RollNo,SName ,Age,Gender,Course)
VALUES(111,'Saii',33,'Female','ECE'),
(121,'Sam',20,'Female','ECE'),
(131,'Bhuvan',20,'Female','ECE');

UPDATE Stud
SET Age=20,Course='Physics'
WHERE RollNo=111;
