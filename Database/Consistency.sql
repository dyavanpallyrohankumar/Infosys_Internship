-- Clean setup
IF OBJECT_ID('Accounts', 'U') IS NOT NULL
    DROP TABLE Accounts;

CREATE TABLE Accounts (
    account_id INT PRIMARY KEY,
    balance DECIMAL(10,2) CHECK (balance >= 0)   -- consistency rule: no negative balances
);

INSERT INTO Accounts VALUES (1, 1000.00), (2, 2000.00);

SELECT 'Initial Data' AS stage, * FROM Accounts;

--------------------------------------------------------
-- 1. FAIL CASE: Violation of Consistency (Rollback)
--------------------------------------------------------
BEGIN TRANSACTION;

-- Debit more money than available → would cause negative balance
UPDATE Accounts SET balance = balance - 1500 WHERE account_id = 1;

-- Credit to another account
UPDATE Accounts SET balance = balance + 1500 WHERE account_id = 2;

-- Try to commit
COMMIT TRANSACTION;   -- ❌ This will FAIL because of CHECK constraint

ROLLBACK TRANSACTION; -- Rollback is triggered

SELECT 'After Consistency Violation' AS stage, * FROM Accounts;



BEGIN TRY
    BEGIN TRANSACTION;

    -- Debit more money than available → would cause negative balance
    UPDATE Accounts SET balance = balance - 1500 WHERE account_id = 1;

    -- Credit to another account
    UPDATE Accounts SET balance = balance + 1500 WHERE account_id = 2;

    COMMIT TRANSACTION;
END TRY
BEGIN CATCH
    ROLLBACK TRANSACTION;

    -- Optional: log or print error
    SELECT ERROR_MESSAGE() AS ErrorMessage;
END CATCH


--------------------------------------------------------
-- 2. SUCCESS CASE: Consistent Transfer
--------------------------------------------------------
BEGIN TRANSACTION;

-- Debit valid amount
UPDATE Accounts SET balance = balance - 500 WHERE account_id = 1;

-- Credit same amount
UPDATE Accounts SET balance = balance + 500 WHERE account_id = 2;

COMMIT TRANSACTION;

SELECT 'After Consistent Transfer' AS stage, * FROM Accounts;
