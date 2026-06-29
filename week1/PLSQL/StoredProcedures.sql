/*
Description:
This program creates a stored procedure named
DISPLAY_EMPLOYEE which displays sample employee
details using DBMS_OUTPUT.PUT_LINE.
====================================================
*/

CREATE OR REPLACE PROCEDURE display_employee
AS
BEGIN
DBMS_OUTPUT.PUT_LINE('Employee ID   : 101');
DBMS_OUTPUT.PUT_LINE('Employee Name : John');
DBMS_OUTPUT.PUT_LINE('Salary        : 50000');
END;
/