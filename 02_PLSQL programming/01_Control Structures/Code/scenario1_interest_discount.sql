--------------------------------------------------------------------------------
-- File       : scenario1_interest_discount.sql
-- Author     : MonigaBalasubramanian
-- Created on : 28-June-2025
-- Purpose    : Apply a 1% discount to loan interest rates for customers above 60 years old
-- Usage      : Run this in Oracle SQL Developer or any compatible PL/SQL tool
-- Notes      : Includes table creation, sample data, and PL/SQL block logic
--------------------------------------------------------------------------------

-- 1. Create table 'customers' (only if not already created)
CREATE TABLE customers (
    customer_id   NUMBER PRIMARY KEY,         -- Unique ID for each customer
    name          VARCHAR2(100),              -- Customer name
    age           NUMBER,                     -- Customer age
    balance       NUMBER,                     -- Current account balance
    is_vip        CHAR(1),                    -- VIP flag ('Y' or 'N')
    loan_interest NUMBER                      -- Current interest rate on loan
);

-- 2. Insert sample data into 'customers' table
INSERT INTO customers VALUES (101, 'Ravi', 65, 15000, 'N', 8.5);
INSERT INTO customers VALUES (102, 'Asha', 45, 8000,  'N', 9.0);
INSERT INTO customers VALUES (103, 'Kiran', 70, 12000, 'N', 10.0);
INSERT INTO customers VALUES (104, 'Divya', 59, 9500,  'N', 8.0);
COMMIT;

-- 3. PL/SQL block: Apply 1% discount to customers over 60 years of age
BEGIN
    FOR c IN (SELECT customer_id, loan_interest FROM customers WHERE age > 60) LOOP
        -- Decrease the loan interest by 1% for eligible customers
        UPDATE customers
        SET loan_interest = loan_interest - 1
        WHERE customer_id = c.customer_id;
    END LOOP;
    COMMIT;
END;
/
