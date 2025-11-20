CREATE DATABASE IF NOT EXISTS healthcare;
USE healthcare;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50),
  password VARCHAR(255),
  full_name VARCHAR(100),
  role VARCHAR(20)
);

CREATE TABLE appointments (
  id INT AUTO_INCREMENT PRIMARY KEY,
  patient_id INT,
  doctor_id INT,
  appointment_datetime DATETIME,
  reason VARCHAR(255),
  status VARCHAR(20)
);
