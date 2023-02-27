--
-- The CREATE TABLE statement defines a table. In MPP, you should define a proper distribution key
-- The distribution key helps performance by spreading table data evenly across data partitions and 
-- (with Hash) collocating grows commonly fetched together. Generally, specify few columns, 
-- and ones that have distinct, evenly distributed values.
--
-- Modify the example statement below. Edit the {} variables. Choose an option in [].
--
CREATE TABLE "JZL39003".payee ( payeeName VARCHAR(60) ,payeeNickName VARCHAR(60) ,ifsc VARCHAR(11) ,mobileNumber VARCHAR(12)  ,customerId VARCHAR(32),  payeeAccount VARCHAR(32)  )           ORGANIZE BY COLUMN
           -- DISTRIBUTE BY HASH( { column-name }, ..., { column-name } )
           -- PARTITION BY [RANGE] ( { column-name } [NULLS FIRST | NULLS LAST] )
           --          ( PARTITION { partition-name } STARTING ( { starting-value } ) ENDING ( { ending-value } ), ..., PARTITION { partition-name } STARTING ( { starting-value } ) ENDING ( { ending-value } ) )
           ;
--
-- Optional: The ALTER TABLE statement defines a primary key for the table
-- Modify the example statement below
--
-- ALTER TABLE { table-name }
--           ADD CONSTRAINT { constraint-name }
--           PRIMARY KEY ( { column-name, ..., column-name } )
--		      ;
-- 
-- Optional: Grant table privileges to others
-- GRANT { CONTROL, INDEX, SELECT, UPDATE, INSERT, ALTER, DELETE, REFERENCES } 
--          ON TABLE { table-schema }.{table-name} TO [public | user | role | group] ;


INSERT
  INTO  "PAYEE" ("PAYEENAME","PAYEENICKNAME","IFSC","MOBILENUMBER","CUSTOMERID","PAYEEACCOUNT")
  VALUES(
'Geetha',               	--PAYEENAME  VARCHAR(60)  
'Geetha Adinarayan',               	--PAYEENICKNAME  VARCHAR(60)  
'ICICI01',               	--IFSC  VARCHAR(11)  
'9986033278',               	--MOBILENUMBER  VARCHAR(12)  
'8622318501743903890',               	--CUSTOMERID  VARCHAR(32)  
'9934567891234567899'                	--PAYEEACCOUNT  VARCHAR(32)  
);


INSERT
  INTO  "PAYEE" ("PAYEENAME","PAYEENICKNAME","IFSC","MOBILENUMBER","CUSTOMERID","PAYEEACCOUNT")
  VALUES(
'Subbu',               	--PAYEENAME  VARCHAR(60)  
'Subramaniam Meenakshisundaram',               	--PAYEENICKNAME  VARCHAR(60)  
'ICICI01',               	--IFSC  VARCHAR(11)  
'9986033278',               	--MOBILENUMBER  VARCHAR(12)  
'8622318501743903890',               	--CUSTOMERID  VARCHAR(32)  
'77345678912345678992'                	--PAYEEACCOUNT  VARCHAR(32)  
);


INSERT
  INTO  "PAYEE" ("PAYEENAME","PAYEENICKNAME","IFSC","MOBILENUMBER","CUSTOMERID","PAYEEACCOUNT")
  VALUES(
'Harish',               	--PAYEENAME  VARCHAR(60)  
'Harish Bharti',               	--PAYEENICKNAME  VARCHAR(60)  
'ICICI01',               	--IFSC  VARCHAR(11)  
'9986033278',               	--MOBILENUMBER  VARCHAR(12)  
'8622318501743903890',               	--CUSTOMERID  VARCHAR(32)  
'77345678912345678994'                	--PAYEEACCOUNT  VARCHAR(32)  
);


---------------------------------------
--

INSERT
  INTO  "PAYEE" ("PAYEENAME","PAYEENICKNAME","IFSC","MOBILENUMBER","CUSTOMERID","PAYEEACCOUNT")
  VALUES(
'Subbu',               	--PAYEENAME  VARCHAR(60)  
'Subramaniam Meenakshisundaram',               	--PAYEENICKNAME  VARCHAR(60)  
'ICICI01',               	--IFSC  VARCHAR(11)  
'9986033278',               	--MOBILENUMBER  VARCHAR(12)  
'8699318501743903890',               	--CUSTOMERID  VARCHAR(32)  
'77345678912345678992'                	--PAYEEACCOUNT  VARCHAR(32)  
);


INSERT
  INTO  "PAYEE" ("PAYEENAME","PAYEENICKNAME","IFSC","MOBILENUMBER","CUSTOMERID","PAYEEACCOUNT")
  VALUES(
'Harish',               	--PAYEENAME  VARCHAR(60)  
'Harish Bharti',               	--PAYEENICKNAME  VARCHAR(60)  
'ICICI01',               	--IFSC  VARCHAR(11)  
'9986033278',               	--MOBILENUMBER  VARCHAR(12)  
'8699318501743903890',               	--CUSTOMERID  VARCHAR(32)  
'77345678912345678994'                	--PAYEEACCOUNT  VARCHAR(32)  
);