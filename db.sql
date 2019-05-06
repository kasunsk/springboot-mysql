CREATE TABLE USER (
  USER_ID INT NOT NULL auto_increment,
  USER_NAME VARCHAR(40) NOT NULL,
  USER_ADDRESS VARCHAR(80) NOT NULL,	
  CREATED_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  LAST_MODIFIED_DATE TIMESTAMP NULL ON UPDATE CURRENT_TIMESTAMP,
  VERSION INT(3),
  PRIMARY KEY (USER_ID)
)ENGINE=InnoDB;

INSERT INTO USER VALUES (1,'ADMIN','my address, address, sri lanka', CURRENT_TIMESTAMP, NULL ,0);

INSERT INTO USER VALUES (2,'KASUN','Bukit batok, Singapore', CURRENT_TIMESTAMP, NULL ,0);

INSERT INTO USER VALUES (3,'KASUN KARIYAWASAM','Bukit batok East Ave 5, Singapore', CURRENT_TIMESTAMP, NULL ,0);
