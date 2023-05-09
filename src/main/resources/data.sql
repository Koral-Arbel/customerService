DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
        id int(11) unsigned NOT NULL AUTO_INCREMENT,
        first_name varchar(300) NOT NULL DEFAULT '',
        last_name varchar(300) NOT NULL DEFAULT '',
        email varchar(300) NOT NULL DEFAULT '',
        age int(120) NOT NULL DEFAULT '',
        address varchar(300) NOT NULL DEFAULT '',
        joining_date TIMESTAMP,
        PRIMARY KEY (id)
);
