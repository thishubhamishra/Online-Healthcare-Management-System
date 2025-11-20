# Online-Healthcare-Management-System
This is a web-based Online Healthcare Management System implemented in Java using Core Java, JDBC, Servlets, JSP, and MySQL.
It allows users to:

Register as Patient or Doctor

Login with role-based access

Book appointments (Patient)

Manage/view appointments (Doctor)

Maintain user and appointment data in a database

The system follows MVC architecture, demonstrates modular design, and uses multiple Java classes with clean OOP principles.

Features
User Management

Register as Patient or Doctor

Login with authentication

Role-based dashboards

Session handling with Servlets

Appointment System

Patients can book appointments

Doctors can view assigned appointments

Stores date, time, reason, and status

Appointment status: BOOKED / CANCELLED / COMPLETED

Database Integration

MySQL database using JDBC

DAO (Data Access Object) pattern

Secure PreparedStatement queries

schema.sql for easy setup

Web Functionality

JSP pages for UI

Servlets for handling logic

Forward/redirect navigation

Clean folder structure

OOP Concepts Demonstrated

Encapsulation:
All model classes (User, Appointment) have private fields with getters/setters.

Modularity:
DAO interfaces, DAO implementations, model classes, servlets, and JSPs are cleanly separated.

Abstraction:
Database actions like saveUser(), findByUsername(), saveAppointment() are abstracted into DAO methods.

Reusability:
DBUtil.java centralizes database connection handling.

How to Run
1. Import the database

Run the SQL file:

mysql -u root -p < schema.sql

2. Configure DB credentials

In:

src/main/java/com/myapp/healthcare/util/DBUtil.java


Update:

private static final String USER = "root";
private static final String PASS = "your_mysql_password";

3. Build the project

Using Maven:

mvn clean package

4. Deploy to Tomcat

Copy the generated .war file to:

apache-tomcat/webapps/

5. Run the application

Start Tomcat and open:

http://localhost:8080/healthcare/login.jsp

Usage Guide
Patient

Register or login

Access Patient Dashboard

Book an appointment

View booked appointments

Doctor

Login

Access Doctor Dashboard

View appointments assigned to that doctor

Admin (optional future module)

Manage users

Manage doctors

Manage appointments

Example Output (Equivalent Console View)
--- Login Page ---
Enter Username: shubham
Enter Password: ******
Role: PATIENT
Login Successful → Redirecting to Patient Dashboard...

--- Patient Dashboard ---
1. Book Appointment
2. View Appointments
3. Logout

--- Book Appointment ---
Doctor ID: 3
Date & Time: 2025-01-22T15:30
Reason: General Checkup
Appointment booked successfully!

Future Enhancements

Store doctor availability

Prevent double-booking of appointment slots

Add Admin module

Email/SMS notifications

Password hashing using BCrypt

Bootstrap UI for modern interface

Medical records support

Health reports & analytics

Developed By

Shubham Mishra

Ambar Raj

Ayush Tiwary

Shivam Gupta

License

This project is for educational purposes and open-source.
You are free to modify, improve, and redistribute it with proper attribution.
