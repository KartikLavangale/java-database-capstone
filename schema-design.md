# MySQL Database Schema Design

## 1. Table: Patient
* **id**: INT, Primary Key, Auto Increment
* **name**: VARCHAR(255), Not Null
* **email**: VARCHAR(255), Unique, Not Null
* **password**: VARCHAR(255)
* **phone**: VARCHAR(20)

## 2. Table: Doctor
* **id**: INT, Primary Key, Auto Increment
* **name**: VARCHAR(255), Not Null
* **specialty**: VARCHAR(255)
* **email**: VARCHAR(255), Unique
* **availability**: VARCHAR(255)

## 3. Table: Appointment
* **id**: INT, Primary Key, Auto Increment
* **patient_id**: INT, Foreign Key (References Patient(id))
* **doctor_id**: INT, Foreign Key (References Doctor(id))
* **appointment_date**: DATETIME
* **status**: VARCHAR(50)
