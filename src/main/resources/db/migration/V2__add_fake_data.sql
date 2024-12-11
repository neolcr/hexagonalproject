INSERT INTO example_domain (desc)
SELECT desc
FROM CSVREAD('src/test/resources/com/example/hexagonalproject/test-data.csv');
