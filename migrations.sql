USE lister_db;

DROP TABLE IF EXISTS items;

CREATE TABLE items (

  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  PRIMARY KEY (id)

);