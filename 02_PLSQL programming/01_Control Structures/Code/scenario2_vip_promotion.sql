--------------------------------------------------------------------------------
-- File       : scenario2_vip_promotion.sql
-- Author     : MonigaBalasubramanian
-- Created on : 28-June-2025
-- Purpose    : Promote customers to VIP status if their account balance exceeds $10,000
-- Description: This script creates a 'customers' table, inserts sample records, 
--              and applies business logic to set 'is_vip' = 'Y' for eligible customers.
--              Uses a PL/SQL FOR loop with an implicit cursor.
-- Usage      : Run in Oracle SQL Developer or any compatible PL/SQL IDE.
--------------------------------------------------------------------------------

-- 1. Create the 'customers' table
CREATE TABLE customers (
    customer_id   NUMBER PRIMARY KEY,         -- Unique customer ID
    name          VARCHAR2(100),              -- Full name of the customer
    age           NUMBER,                     -- Age of the customer
    balance       NUMBER,                     -- Current account balance
    is_vip        CHAR(1),                    -- VIP status: 'Y' or 'N'
    loan_interest NUMBER                      -- Interest rate on customer's loan
);

-- 2. Insert sample data into 'customers'
INSERT INTO customers VALUES (101, 'Ravi', 65, 15000, 'N', 8.5);
INSERT INTO customers VALUES (102, 'Asha', 45, 8000,  'N', 9.0);
INSERT INTO customers VALUES (103, 'Kiran', 70, 12000, 'N', 10.0);
INSERT INTO customers VALUES (104, 'Divya', 59, 9500,  'N', 8.0);
COMMIT;

-- 3. PL/SQL block: Promote customers to VIP if balance > 10000
BEGIN
    FOR c IN (SELECT customer_id FROM customers WHERE balance > 10000) LOOP
        -- Set is_vip to 'Y' for qualifying customers
        UPDATE customers
        SET is_vip = 'Y'
        WHERE customer_id = c.customer_id;
    END LOOP;
    COMMIT;
END;
/
