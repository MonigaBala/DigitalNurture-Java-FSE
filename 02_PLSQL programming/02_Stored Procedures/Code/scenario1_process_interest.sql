--------------------------------------------------------------------------------
-- File       : scenario1_process_interest.sql
-- Author     : MonigaBalasubramanian
-- Purpose    : Stored procedure to apply 1% monthly interest to all savings accounts
--------------------------------------------------------------------------------

-- Step 1: Create 'accounts' table
CREATE TABLE accounts (
    account_id   NUMBER PRIMARY KEY,
    customer_id  NUMBER,
    account_type VARCHAR2(20),  -- e.g., 'Savings', 'Current'
    balance      NUMBER
);

-- Step 2: Insert sample accounts
INSERT INTO accounts VALUES (1, 101, 'Savings', 10000);
INSERT INTO accounts VALUES (2, 102, 'Savings', 15000);
INSERT INTO accounts VALUES (3, 103, 'Current', 20000);
COMMIT;

-- Step 3: Stored procedure to process 1% interest for savings accounts
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_type = 'Savings';
    COMMIT;
END;
/
