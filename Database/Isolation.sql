
🔹 SQL Server Script (Serializable Demo)
-- Clean setup
IF OBJECT_ID('Orders', 'U') IS NOT NULL
    DROP TABLE Orders;

CREATE TABLE Orders (
    order_id INT PRIMARY KEY,
    amount INT
);

INSERT INTO Orders VALUES (1, 100), (2, 200), (3, 300);

SELECT 'Initial Data' AS stage, * FROM Orders;
GO

--------------------------------------------------------
-- SESSION 1: Serializable Transaction
--------------------------------------------------------
-- Open Session 1 window and run this block
SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;
BEGIN TRANSACTION;

-- Query orders > 100
SELECT 'Session 1 - First Read' AS stage, * FROM Orders WHERE amount > 100;

-- Keep this transaction open, don’t commit yet
-- Now switch to Session 2 and run its block


--------------------------------------------------------
-- SESSION 2: Try to Insert During Session 1
--------------------------------------------------------
-- Open Session 2 window and run this block
SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;

-- This will BLOCK until Session 1 commits
INSERT INTO Orders VALUES (4, 150);

-- After Session 1 commits, this insert succeeds
SELECT 'Session 2 After Insert' AS stage, * FROM Orders;

--------------------------------------------------------
-- SESSION 1: Commit Transaction
--------------------------------------------------------
-- Go back to Session 1 and commit
COMMIT TRANSACTION;

-- Read again (phantom row 150 will appear only now)
SELECT 'Session 1 - After Commit' AS stage, * FROM Orders WHERE amount > 100;

1.	Initial Data → (100, 200, 300)

2.	Session 1 first read → shows 200 & 300

3.	Session 2 insert → BLOCKED until Session 1 commits

4.	After Session 1 commit → Session 2 insert goes through

5.	Session 1 second read → now sees 200, 300, and 150

________________________________________
⚡ Note: You must run this in two query windows (Session 1 & Session 2), because isolation can only be observed with concurrent transactions.
________________________________________


