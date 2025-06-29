--------------------------------------------------------------------------------
-- File       : scenario3_loan_reminder.sql
-- Author     : MonigaBalasubramanian
-- Created on : 28-June-2025
-- Purpose    : Send loan due reminders to customers with loans due in the next 30 days
-- Description: This script creates 'customers' and 'loans' tables, inserts sample data,
--              and prints reminder messages using DBMS_OUTPUT for upcoming due loans.
-- Usage      : Run this script in Oracle SQL Developer or any PL/SQL-enabled IDE.
--------------------------------------------------------------------------------

-- 1. Create the 'customers' table
CREATE TABLE customers (
    customer_id   NUMBER PRIMARY KEY,         -- Unique customer ID
    name          VARCHAR2(100),              -- Customer's name
    age           NUMBER,                     -- Customer's age
    balance       NUMBER,                     -- Account balance
    is_vip        CHAR(1),                    -- VIP status: 'Y' or 'N'
    loan_interest NUMBER                      -- Current loan interest rate
);

-- 2. Create the 'loans' table
CREATE TABLE loans (
    loan_id       NUMBER PRIMARY KEY,         -- Unique loan ID
    customer_id   NUMBER REFERENCES customers(customer_id), -- FK to customers
    due_date      DATE                        -- Due date of the loan
);

-- 3. Insert sample data into 'customers'
INSERT INTO customers VALUES (101, 'Ravi', 65, 15000, 'N', 8.5);
INSERT INTO customers VALUES (102, 'Asha', 45, 8000,  'N', 9.0);
INSERT INTO customers VALUES (103, 'Kiran', 70, 12000, 'N', 10.0);
INSERT INTO customers VALUES (104, 'Divya', 59, 9500,  'N', 8.0);
COMMIT;

-- 4. Insert sample data into 'loans'
INSERT INTO loans VALUES (201, 101, SYSDATE + 10);  -- Loan due in 10 days
INSERT INTO loans VALUES (202, 102, SYSDATE + 40);  -- Loan due in 40 days (will not be shown)
INSERT INTO loans VALUES (203, 103, SYSDATE + 25);  -- Loan due in 25 days
COMMIT;

-- 5. Enable DBMS output to view printed reminders
SET SERVEROUTPUT ON;

-- 6. PL/SQL block to print reminders for loans due in next 30 days
BEGIN
    FOR l IN (
        SELECT l.loan_id, c.name, l.due_date
        FROM loans l
        JOIN customers c ON c.customer_id = l.customer_id
        WHERE l.due_date <= SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || l.loan_id || 
                             ' for customer ' || l.name || 
                             ' is due on ' || TO_CHAR(l.due_date, 'DD-Mon-YYYY'));
    END LOOP;
END;
/
