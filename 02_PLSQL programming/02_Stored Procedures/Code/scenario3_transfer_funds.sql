--------------------------------------------------------------------------------
-- File       : scenario3_transfer_funds.sql
-- Author     : MonigaBalasubramanian
-- Purpose    : Stored procedure to transfer funds between accounts
--------------------------------------------------------------------------------

-- Step 1: Use 'accounts' table from Scenario 1

-- Step 2: Stored procedure to transfer funds
CREATE OR REPLACE PROCEDURE TransferFunds(
    source_id IN NUMBER,
    target_id IN NUMBER,
    amount    IN NUMBER
) IS
    insufficient_balance EXCEPTION;
BEGIN
    -- Check balance
    DECLARE
        src_balance NUMBER;
    BEGIN
        SELECT balance INTO src_balance FROM accounts WHERE account_id = source_id;

        IF src_balance < amount THEN
            RAISE insufficient_balance;
        END IF;

        -- Deduct from source
        UPDATE accounts
        SET balance = balance - amount
        WHERE account_id = source_id;

        -- Add to target
        UPDATE accounts
        SET balance = balance + amount
        WHERE account_id = target_id;

        COMMIT;
    END;
EXCEPTION
    WHEN insufficient_balance THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient funds in source account.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
/
