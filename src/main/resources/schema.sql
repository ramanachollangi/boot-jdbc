-- Drop the table if it already exists to avoid duplicate errors
DROP TABLE IF EXISTS users;
CREATE TABLE store (
                       store_id INT NOT NULL AUTO_INCREMENT,
                       city VARCHAR(255) DEFAULT NULL,
                       country VARCHAR(255) DEFAULT NULL,
                       location VARCHAR(255) DEFAULT NULL,
                       phone VARCHAR(255) DEFAULT NULL,
                       state VARCHAR(255) DEFAULT NULL,
                       store_name VARCHAR(255) DEFAULT NULL,
                       zip VARCHAR(255) DEFAULT NULL,
                       PRIMARY KEY (store_id)
);

