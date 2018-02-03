CREATE TABLE IF NOT EXISTS users (
  user_id INTEGER PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  patronymic VARCHAR(255),
  gender VARCHAR(255),
  mar_status BOOLEAN
);

CREATE TABLE IF NOT EXISTS passport (
  user_id INTEGER REFERENCES users(user_id),
  ser_passport VARCHAR(255),
  number_passport VARCHAR(255),
  extradition VARCHAR(255),
  ex_date TIMESTAMP,
  inn VARCHAR(255),
  snils VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS phone (
  user_id INTEGER REFERENCES users(user_id),
  phone_number VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS address (
  user_id INTEGER REFERENCES users(user_id),
  address_reg VARCHAR(255),
  address_res VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS job (
  user_id INTEGER REFERENCES users(user_id),
  position VARCHAR(255),
  kategory VARCHAR(255),
  subdivision VARCHAR(255),
  rate FLOAT,
  salary FLOAT,
  order_number VARCHAR(255),
  order_date TIMESTAMP,
  empl_date TIMESTAMP,
  order_dismissal VARCHAR(255),
  order_dis_date TIMESTAMP,
  dis_date TIMESTAMP,
  term TIMESTAMP,
  work_hours INTEGER
);