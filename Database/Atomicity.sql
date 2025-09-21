use ems2;

-- Clean setup
IF OBJECT_ID('Accounts', 'U') IS NOT NULL
    DROP TABLE Accounts;

CREATE TABLE Accounts (
    account_id INT PRIMARY KEY,
    balance DECIMAL(10,2)
);

INSERT INTO Accounts VALUES (1, 1000.00), (2, 2000.00);

ALTER TABLE Accounts ADD CONSTRAINT chk_balance CHECK (balance >= 0);

SELECT 'Initial Data' AS stage, * FROM Accounts;

--------------------------------------------------------
-- 1. FAIL CASE: ROLLBACK
--------------------------------------------------------
BEGIN TRANSACTION;
select * from Accounts;
-- Debit succeeds
UPDATE Accounts SET balance = balance - 500 WHERE account_id = 1;

-- Force an error to simulate failure
-- (wrong column name)
UPDATE Accounts SET balanc = balance + 500 WHERE account_id = 2;

-- Transaction will not commit because of error
ROLLBACK TRANSACTION;

SELECT 'After ROLLBACK (Fail Case)' AS stage, * FROM Accounts;

--------------------------------------------------------
-- 2. SUCCESS CASE: COMMIT
--------------------------------------------------------
BEGIN TRANSACTION;

-- Debit succeeds
UPDATE Accounts SET balance = balance - 500 WHERE account_id = 1;

-- Credit succeeds
UPDATE Accounts SET balance = balance + 500 WHERE account_id = 2;

COMMIT TRANSACTION;

SELECT 'After COMMIT (Success Case)' AS stage, * FROM Accounts;
