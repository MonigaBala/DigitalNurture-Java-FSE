# 💻 Cognizant DeepSkilling – Java FSE Track

This repository contains Java and PL/SQL assignments completed as part of the **Digital Nurture 4.0 - Java FSE DeepSkilling Program** at Cognizant.

Each assignment follows **clean OOP practices**, modular structure, and demonstrates key concepts using Java, PL/SQL, and testing tools.

---

## ✅ Week 01 Submissions

➡️ **Focus:** Core Java, OOP, Recursion, Factory & Singleton Design Patterns  
➡️ **Packages:** `com.forecasting`, `com.factorymethods`, `com.ecommerce`, `com.singleton`

---

### 1️⃣ Financial Forecasting Tool  
📁 `com.forecasting.*`  
🔹 Uses recursion and tail recursion to forecast future investment value  
🔹 Validates user input for robustness  
🔹 Console-based input/output

---

### 2️⃣ Factory Pattern - PDF/Word Document Generator  
📁 `com.factorymethods.*`  
🔹 Demonstrates the Factory Design Pattern  
🔹 Generates PDF and Word documents using interfaces and concrete classes

---

### 3️⃣ E-commerce Product Search  
📁 `com.ecommerce.*`  
🔹 Accepts product details  
🔹 Allows keyword-based product search  
🔹 Uses arrays and filtering logic

---

### 4️⃣ Singleton Pattern Implementation  
📁 `com.singleton.*`  
🔹 Implements Singleton Design Pattern  
🔹 Ensures only one instance  
🔹 Used in scenarios like config, logging, etc.

---

## ✅ Week 02 Submissions

➡️ **Focus:** PL/SQL Blocks, Stored Procedures, JUnit Testing, SLF4J Logging, Mockito Mocking  
➡️ **Folders:** `FSE_ControlStructures_Exercise`, `FSE_JUnitTesting`, `FSE_LoggingExercise`, `FSE_MockTesting`

---

### 📦 1️⃣ PL/SQL Assignments – Control Structures  
📁 `FSE_ControlStructures_Exercise/code/`, `output/`

- **Scenario 1:** Interest Rate Discount  
  🔹 Loops through customers aged > 60  
  🔹 Applies 1% interest discount

- **Scenario 2:** Promote to VIP  
  🔹 Balance > $10,000 → set `is_vip = 'Y'`

- **Scenario 3:** Loan Due Reminders  
  🔹 Prints reminder for loans due in next 30 days

---

### 🔧 2️⃣ PL/SQL Stored Procedures  
📁 `FSE_ControlStructures_Exercise/code/`, `output/`

- **Procedure 1:** `ProcessMonthlyInterest`  
  🔹 Applies 1% interest to all savings account balances

- **Procedure 2:** `UpdateEmployeeBonus`  
  🔹 Adds bonus to salaries in selected department

- **Procedure 3:** `TransferFunds`  
  🔹 Transfers funds between accounts  
  🔹 Validates balance before update

---

### 🧪 3️⃣ JUnit Testing  
📁 `FSE_JUnitTesting/com.testdemo`, `com.aaademo`

- **Exercise 1:** JUnit Setup  
  🔹 Tests arithmetic operations using Maven JUnit project

- **Exercise 2:** Assertions in JUnit  
  🔹 Uses `assertEquals`, `assertTrue`, `assertNotNull`, etc.

- **Exercise 3:** AAA Pattern & Fixtures  
  🔹 Uses `@Before` and `@After`  
  🔹 Implements Arrange-Act-Assert structure

---

### 📋 4️⃣ SLF4J Logging  
📁 `FSE_LoggingExercise/com.logging.example`

- Logs warning and error messages  
- Configured with SLF4J + Logback  
- Simulates exceptions and logs them

---

### 🔁 5️⃣ Mockito Mocking & Verification  
📁 `FSE_MockTesting/com.mockdemo`, `com.mockverify`

- **Mocking & Stubbing:**  
  🔹 Mocks `ExternalApi` and stubs return value

- **Interaction Verification:**  
  🔹 Verifies method `getData()` was called on the mock

---

## 🛠 Technologies Used

- Java 17 / Java 21  
- Oracle SQL Developer (PL/SQL)  
- Eclipse IDE  
- Maven  
- JUnit 4.13 / 5.x  
- Mockito 4.x  
- SLF4J & Logback  
- Git & GitHub

---

## 🚀 How to Run

### 🟢 Java Projects

```bash
git clone https://github.com/MonigaBala/DigitalNurture-Java-FSE.git

1. Open Eclipse → File → Import → Maven > Existing Maven Projects
2. Navigate to your test/main classes
3. Right-click → Run As → Java Application or JUnit Test

🔵 PL/SQL Scripts

1. Open Oracle SQL Developer
2. Enable DBMS_OUTPUT
3. Run .sql files from FSE_ControlStructures_Exercise/code/
4. Copy results to matching .txt files in the output/ folder

👩‍💻 Author
Moniga Balasubramanian
📧 monigabala1207@gmail.com
🎓 Java FSE Trainee – Cognizant Digital Nurture 4.0

📅 Submission Summary
Week	Focus Areas	Status
01	Core Java, Recursion, Design Patterns	✅ Done
02	PL/SQL, Stored Procedures, JUnit, Mockito	✅ Done

✅ Thank you for reviewing!
