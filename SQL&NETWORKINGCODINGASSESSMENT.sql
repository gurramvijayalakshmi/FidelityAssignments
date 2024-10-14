CREATE TABLE Worker (
    WORKER_ID INT PRIMARY KEY,
    FIRST_NAME VARCHAR(50),
    LAST_NAME VARCHAR(50),
    SALARY REAL,
    JOINING_DATE DATE,
    DEPARTMENT VARCHAR(20)
);


INSERT INTO Worker (WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT)
VALUES
(1, 'Monika', 'Arora', 100000, '2020-02-14', 'HR'),
(2, 'Niharika', 'Verma', 80000, '2011-02-14', 'Admin'),
(3, 'Vishal', 'Singhal', 300000, '2020-02-14', 'HR'),  
(4, 'Amitabh', 'Singh', 500000, '2020-02-14', 'Admin'),
(5, 'Vivek', 'Bhati', 500000, '2011-06-14', 'Admin'),   
(6, 'Vipul', 'Diwan', 200000, '2011-06-14', 'Account'),   
(7, 'Satish', 'Kumar', 75000, '2020-01-14', 'Account'),
(8, 'Geetika', 'Chauhan', 90000, '2011-04-14', 'Admin');


CREATE TABLE Title (
    WORKER_REF_ID INT,
    WORKER_TITLE VARCHAR(20),
    AFFECTED_FROM DATE,
    FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);


INSERT INTO Title (WORKER_REF_ID, WORKER_TITLE, AFFECTED_FROM)
VALUES 
(1, 'Manager', '2016-02-20'),
(2, 'Executive', '2016-06-11'),
(8, 'Executive', '2016-06-11'),
(5, 'Manager', '2016-06-11'),
(4, 'Asst.Manager', '2016-06-11'),  
(7, 'Executive', '2016-06-11'),
(6, 'Lead', '2016-06-11'),
(3, 'Lead', '2016-06-11');

CREATE TABLE Bonus (
    WORKER_REF_ID INT,
    BONUS_AMOUNT INT,
    BONUS_DATE DATE,
    FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

INSERT INTO Bonus (WORKER_REF_ID, BONUS_AMOUNT, BONUS_DATE)
VALUES
(1, 5000, '2020-02-16'),
(2, 3000, '2011-06-16'),
(3, 4000, '2020-02-16'),
(1, 4500, '2020-12-16'),
(2, 3500, '2011-02-16'),
(4, 4500, '2020-02-16'),
(5, 3500, '2011-02-16');

1. Write a query to display the firstname, salary and title for all workers.
ans:
SELECT 
    w.FIRST_NAME,
    w.SALARY,
    t.WORKER_TITLE
FROM 
    Worker w
LEFT JOIN 
    Title t ON w.WORKER_ID = t.WORKER_REF_ID;


2. Write a plpgsql function to display the count of worker(s) based on the nth highestsalary.
Note: 1
st highest salary/2nd highest salary i.e. nth highest salary will be passed as parameter
based on which the count will be found and returned.
Ans : 

CREATE OR REPLACE FUNCTION count_workers_nth_highest_salary(n INT)
RETURNS INT AS $$
DECLARE
    nth_salary REAL;
    worker_count INT;
BEGIN
    SELECT DISTINCT SALARY INTO nth_salary
    FROM Worker
    ORDER BY SALARY DESC
    LIMIT 1 OFFSET n - 1;  
    SELECT COUNT(*) INTO worker_count
    FROM Worker
    WHERE SALARY = nth_salary;

    RETURN worker_count;
END;
$$
 LANGUAGE plpgsql;


