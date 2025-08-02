# 💻 Cognizant DeepSkilling – Java FSE Track

This repository contains Java, PL/SQL, and ReactJS assignments completed as part of the **Digital Nurture 4.0 - Java FSE DeepSkilling Program** at Cognizant.

Each assignment follows **clean OOP practices**, modular structure, and demonstrates key concepts using Java, PL/SQL, testing tools, ORM frameworks (JPA, Hibernate), Spring Boot, and React.

---

## ✅ Week 01 Submissions  
➡️ **Focus:** Core Java, OOP, Recursion, Factory & Singleton Design Patterns  
➡️ **Packages:** `com.forecasting`, `com.factorymethods`, `com.ecommerce`, `com.singleton`

### 1️⃣ Financial Forecasting Tool  
📁 `com.forecasting.*`  
🔹 Recursion and tail recursion for investment forecasting  
🔹 Robust user input validation  
🔹 Console-based app

### 2️⃣ Factory Pattern - PDF/Word Document Generator  
📁 `com.factorymethods.*`  
🔹 Implements Factory Design Pattern  
🔹 Dynamically generates documents via interfaces

### 3️⃣ E-commerce Product Search  
📁 `com.ecommerce.*`  
🔹 Keyword-based product filtering  
🔹 Uses arrays and search logic

### 4️⃣ Singleton Pattern Implementation  
📁 `com.singleton.*`  
🔹 Ensures a single instance  
🔹 Commonly used in logging/config scenarios

---

## ✅ Week 02 Submissions  
➡️ **Focus:** PL/SQL Blocks, Procedures, JUnit, SLF4J, Mockito  
➡️ **Folders:** `FSE_ControlStructures_Exercise`, `FSE_JUnitTesting`, `FSE_LoggingExercise`, `FSE_MockTesting`

### 📦 PL/SQL Control Structures  
📁 `FSE_ControlStructures_Exercise/code/`  
- Interest Rate Discount  
- Promote to VIP  
- Loan Due Reminders  

### 🔧 Stored Procedures  
📁 `FSE_ControlStructures_Exercise/code/`  
- `ProcessMonthlyInterest`, `TransferFunds`, `UpdateEmployeeBonus`  
- Validations + error handling  

### 🧪 JUnit Testing  
📁 `FSE_JUnitTesting`  
🔹 Includes test setup, assertions, and fixtures

### 📋 SLF4J Logging  
📁 `FSE_LoggingExercise`  
🔹 Runtime logging and exception simulation

### 🔁 Mockito Testing  
📁 `FSE_MockTesting`  
🔹 External API mocking and verification

---

## ✅ Week 03 Submissions  
➡️ **Focus:** ORM with JPA, Hibernate, Spring Data JPA  
➡️ **Folders:** `Week03/FSE_JPA_ORM/`

### 1️⃣ Spring JPA – Country Retrieval  
📁 `com.springdatajpaexample`  
🔹 Uses `JpaRepository` with MySQL  
🔹 Configured via `application.properties`

### 2️⃣ One-to-Many – Department & Employee  
📁 `com.jpaexample.onetomany`  
🔹 Demonstrates cascading with `@OneToMany`

### 3️⃣ Many-to-Many – Student & Course  
📁 `com.jpaexample.manytomany`  
🔹 Bidirectional mapping with `@JoinTable`

### 4️⃣ One-to-One – Employee & Address  
📁 `com.jpaexample.onetoone`  
🔹 Unique relation using `@OneToOne`

### 5️⃣ JPA vs Hibernate vs Spring Data  
📁 `com.hibernateexample`, `com.springdatajpaexample`  
🔹 Code comparison + transaction handling

---

## ✅ Week 04 Submissions  
➡️ **Focus:** Spring Boot REST APIs  
➡️ **Folder:** `04_Spring REST using Spring Boot 3`

### 1️⃣ Spring Project Setup  
📁 `01_Create a Spring Web Project using Maven`  
🔹 Setup with basic controller

### 2️⃣ Spring Core – XML Config  
📁 `02_Spring Core`  
🔹 Loads beans from XML using `ApplicationContext`

### 3️⃣ REST – Get All Countries  
📁 `03_REST – GET All Countries`  
🔹 Uses XML file as mock DB

### 4️⃣ REST – Get Country by Code  
📁 `04_REST – GET Country by Code`  
🔹 Case-insensitive code match

### 5️⃣ JWT Authentication Service  
📁 `05_JWT Token Auth`  
🔹 Basic auth + returns signed JWT token

---

## ✅ Week 05 Submissions  
➡️ **Focus:** Microservices with Spring Boot  
➡️ **Folder:** `05_Microservices with Spring Boot`

### 1️⃣ Account Microservice  
📁 `account/`  
🔹 GET `/accounts/{number}` returns dummy account

### 2️⃣ Loan Microservice  
📁 `loan/`  
🔹 GET `/loans/{number}` returns dummy loan  
🔹 Runs on port 8081

---

## ✅ Week 06 Submissions  
➡️ **Focus:** ReactJS – JSX, Components, Props, State, Lifecycle, Styling  
➡️ **Folder:** `06_React/02_ReactJS-HOL/Code/`

### 1️⃣ JSX Demo  
📁 `myfirstreact/`  
🔹 Simple JSX component  
🔹 `"Welcome to the first session of React"`

### 2️⃣ Class Components – Student Portal  
📁 `StudentApp/`  
🔹 Components: `Home`, `About`, `Contact`  
🔹 Rendered in `App.js` using class syntax

### 3️⃣ Functional Component – Score Calculator  
📁 `scorecalculatorapp/`  
🔹 Stateless function with props  
🔹 Calculated average and styled using `mystyle.css`

### 4️⃣ Lifecycle Methods & API – Blog  
📁 `blogapp/`  
🔹 `componentDidMount()` + `fetch()` to load posts  
🔹 Handled error with `componentDidCatch()`

### 5️⃣ Styling – CSS Modules + Inline  
📁 `cohortdashboardapp/`  
🔹 CSS modules with conditional styles  
🔹 Semantic tags (`<dl>`, `<dt>`, `<dd>`)  
🔹 UI matched provided sample

---

## ✅ Week 07 Submissions  
➡️ **Focus:** ReactJS – Events, Conditional Rendering, Form Handling, JSX with DOM  
➡️ **Folder:** `07_React/Week07_HandsOns/`

### 1️⃣ `cricketapp` – Player Listing & Filtering  
📁 `cricketapp/`  
🔹 Display 11 players using `map()`  
🔹 Filter players with score < 70 using arrow functions  
🔹 Team splitting using **destructuring**  
🔹 Merge of T20 and Ranji players using **spread operator**

### 2️⃣ `officespacerentalapp` – JSX + Conditional Styling  
📁 `officespacerentalapp/`  
🔹 Display office image, name, rent, and address using JSX  
🔹 Rent styled **green if > ₹60000** or **red if < ₹60000**

### 3️⃣ `eventexamplesapp` – React Event Handling  
📁 `eventexamplesapp/`  
🔹 Buttons: Increment, Decrement, Welcome  
🔹 Synthetic event handling (onClick → "I was clicked")  
🔹 Currency converter: INR to Euro using state and form event

### 4️⃣ `ticketbookingapp` – Conditional Navigation with Login  
📁 `ticketbookingapp/`  
🔹 Shows **Guest page** for browsing flights  
🔹 After Login, allows ticket booking via **User page**  
🔹 Login/Logout toggles the view conditionally

### 5️⃣ `bloggerapp` – Multiple Conditional Rendering Techniques  
📁 `bloggerapp/`  
🔹 Three components: BookDetails, BlogDetails, CourseDetails  
🔹 Demonstrates 4 types of rendering:
  - `if/else`
  - element variables
  - ternary operator
  - logical `&&`

---

## 🛠 Technologies Used

- Java 17 / Java 21  
- Oracle SQL Developer (PL/SQL)  
- Eclipse IDE  
- Maven  
- Spring Boot 3.5.3  
- JUnit 4.13 / 5.x  
- Mockito 4.x  
- SLF4J & Logback  
- ReactJS (CRA)  
- Git & GitHub  
- MySQL 8.0  

---

## 🚀 How to Run

### 🟢 Java Projects

```bash
git clone https://github.com/MonigaBala/DigitalNurture-Java-FSE.git

1. Open Eclipse → File → Import → Maven > Existing Maven Projects

2. Navigate to target folder

3. Right-click → Run As → Java Application or JUnit Test

🔵 PL/SQL Scripts
1. Open Oracle SQL Developer

2. Enable DBMS_OUTPUT

3. Run .sql files in FSE_ControlStructures_Exercise/code/

4. Save outputs to .txt files inside /output

👩‍💻 Author
Moniga Balasubramanian
📧 monigabala1207@gmail.com
🎓 Java FSE Trainee – Cognizant Digital Nurture 4.0

📅 Submission Summary

Week	Focus Areas	Status
01	Core Java, Recursion, Design Patterns	✅ Done
02	PL/SQL, Stored Procedures, JUnit, Mockito	✅ Done
03	JPA, Hibernate, ORM, Spring Data JPA	✅ Done
04	Spring Boot REST APIs	✅ Done
05	Microservices with Spring Boot	✅ Done
06	ReactJS Components, Props, Styling	✅ Done
07	ReactJS Events, JSX, Forms, Conditional Rendering	✅ Done

✅ Thank you for reviewing!
