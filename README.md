# Online Healthcare Management System

This repository contains the required files for the Online Healthcare Management System project.  

---

## 1. Project Overview
The Online Healthcare Management System is a Java-based backend project that will manage:

- Users (Patients, Doctors)
- Appointments

In this, we implemented:
- Core Java classes (User, Appointment)
- OOP structure
- MySQL database schema
- JDBC connection using DBUtil
- DAO (Data Access Object) pattern
- Basic Servlets for web integration
- web.xml configuration

This completes the required foundation for a Java web application.

---

## 2. Features Implemented in Review-1

### ✔ Core Java + OOP Concepts
- Encapsulation (private fields + getters/setters)
- Abstraction (DAO interfaces)
- Modularity (different classes for different responsibilities)

### ✔ JDBC + MySQL Integration
- DBUtil.java handles database connection
- Used `com.mysql.cj.jdbc.Driver`
- PreparedStatement used for insert & select queries

### ✔ DAO Layer
- `UserDAO`, `UserDAOImpl`
- `AppointmentDAO`, `AppointmentDAOImpl`

### ✔ Database Schema
Included in `schema.sql`:
- **users** table  
- **appointments** table  

### ✔ Servlet Setup (Required for Review-1)
- RegisterServlet.java
- LoginServlet.java
- web.xml (Servlet mappings)

These files demonstrate web integration and basic request handling.

---

## 3. Included Files
- User.java
- Appointment.java
- DBUtil.java
- UserDAO.java
- UserDAOImpl.java
- AppointmentDAO.java
- AppointmentDAOImpl.java
- schema.sql
- README.md

---

## 4. Team Members
- Shubham Mishra
- Aditya Sharma
- Raushan Roy
- Raushan Tiwari

---

## License
This project is for educational purposes and open-source. You are free to modify and redistribute it with attribution.
