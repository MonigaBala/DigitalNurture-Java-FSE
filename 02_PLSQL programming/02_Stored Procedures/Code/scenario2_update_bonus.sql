--------------------------------------------------------------------------------
-- File       : scenario2_update_bonus.sql
-- Author     : MonigaBalasubramanian
-- Purpose    : Stored procedure to apply bonus % to employees in a given department
--------------------------------------------------------------------------------

-- Step 1: Create 'employees' table
CREATE TABLE employees (
    emp_id      NUMBER PRIMARY KEY,
    name        VARCHAR2(100),
    department  VARCHAR2(50),
    salary      NUMBER
);

-- Step 2: Insert sample employees
INSERT INTO employees VALUES (1, 'Ravi', 'HR', 40000);
INSERT INTO employees VALUES (2, 'Asha', 'IT', 50000);
INSERT INTO employees VALUES (3, 'Kiran', 'IT', 55000);
INSERT INTO employees VALUES (4, 'Divya', 'Finance', 45000);
COMMIT;

-- Step 3: Stored procedure to update bonus salary
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept_name IN VARCHAR2,
    bonus_pct IN NUMBER
) IS
BEGIN
    UPDATE employees
    SET salary = salary + (salary * bonus_pct / 100)
    WHERE department = dept_name;
    COMMIT;
END;
/
