DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
        id int unsigned NOT NULL AUTO_INCREMENT,
        first_name varchar(300) NOT NULL DEFAULT '',
        last_name varchar(300) NOT NULL DEFAULT '',
        email varchar(300) NOT NULL DEFAULT '',
        age int(120) NOT NULL DEFAULT '',
        address varchar(300) NOT NULL DEFAULT '',
        joining_date TIMESTAMP,
        status varchar(300) NOT NULL DEFAULT 'EMPLOYEE',
        PRIMARY KEY (id)
);

--INSERT INTO customer (first_name, last_name, email, age, address, joining_date, status)
-- VALUES
-- ('Ilan', 'Arbel', 'ilan@gmail.com', 53, 'ofra haza 21', current_date, EMPLOYEE),
-- ('Koral', 'Arbeli', 'korali1995@gmail.com', 28, 'ofra haza 21, Haifa', current_date, EMPLOYEE),
-- ('c', 'cc', 'c@gmail.com', 30, 'cen eliezer 45, Haifa', current_date, EMPLOYEE),
-- ('d', 'dd', 'd@gmail.com', 40, 'den eliezer 45, Haifa', current_date, EMPLOYEE),
-- ('e', 'ee', 'e@gmail.com', 50, 'een eliezer 45, Haifa', current_date, EMPLOYEE),
-- ('f', 'ff', 'f@gmail.com', 30, 'fen eliezer 45, Haifa', current_date, EMPLOYEE),
-- ('g', 'gg', 'g@gmail.com', 30, 'gen eliezer 45, Haifa', current_date, EMPLOYEE),
-- ('h', 'hh', 'h@gmail.com', 30, 'hen eliezer 45, Haifa', current_date, EMPLOYEE),
-- ('i', 'ii', 'i@gmail.com', 30, 'ien eliezer 45, Haifa', current_date, EMPLOYEE),
-- ('j', 'jj', 'j@gmail.com', 30, 'jen eliezer 45, Haifa', current_date, EMPLOYEE);
