# 💻 Cognizant DeepSkilling – Java FSE Track

This repository contains Java and PL/SQL assignments completed as part of the **Digital Nurture 4.0 - Java FSE DeepSkilling Program** at Cognizant.

Each assignment follows **clean OOP practices**, modular structure, and demonstrates key concepts using Java, PL/SQL, and testing tools.

---

## ✅ Week 01 Submissions

➡️ Focus: Core Java, OOP, Recursion, Factory & Singleton Design Patterns  
➡️ Packages: `com.forecasting`, `com.factorymethods`, `com.ecommerce`, `com.singleton`

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

➡️ Focus: PL/SQL Blocks, Stored Procedures, JUnit Testing, SLF4J Logging, Mockito Mocking  
➡️ Structured into folders like: `FSE_ControlStructures_Exercise`, `FSE_JUnitTesting`, `FSE_LoggingExercise`, `FSE_MockTesting`

---

### 📦 1️⃣ PL/SQL Assignments – Control Structures  
📁 `FSE_ControlStructures_Exercise/code/`, `output/`

#### ✅ Scenario 1: Interest Rate Discount  
🔹 Loops through customers aged > 60  
🔹 Applies 1% interest discount

#### ✅ Scenario 2: Promote to VIP  
🔹 Balance > $10,000 → set `is_vip = 'Y'`

#### ✅ Scenario 3: Loan Due Reminders  
🔹 Prints reminder for loans due in next 30 days

---

### 🔧 2️⃣ PL/SQL Stored Procedures  
📁 `FSE_ControlStructures_Exercise/code/`, `output/`

#### ✅ `ProcessMonthlyInterest`  
🔹 Applies 1% interest to savings account balances

#### ✅ `UpdateEmployeeBonus`  
🔹 Bonus added to salaries in selected department

#### ✅ `TransferFunds`  
🔹 Transfers between accounts  
🔹 Checks for sufficient balance

---

### 🧪 3️⃣ JUnit Testing  
📁 `FSE_JUnitTesting/com.testdemo`, `com.aaademo`

#### ✅ Exercise 1: JUnit Setup  
🔹 Maven project  
🔹 Tests basic arithmetic operations

#### ✅ Exercise 2: JUnit Assertions  
🔹 Uses various `assert*` methods  
🔹 Validates behavior and outputs

#### ✅ Exercise 3: AAA Pattern & Fixtures  
🔹 Uses `@Before` / `@After` setup-teardown  
🔹 Organizes test logic using AAA pattern

---

### 📋 4️⃣ SLF4J Logging  
📁 `FSE_LoggingExercise/com.logging.example`

#### ✅ Logging with SLF4J + Logback  
🔹 Logs warning and error messages  
🔹 Simulates error using exception handling  
🔹 Configured using Maven dependencies

---

### 🔁 5️⃣ Mockito Mocking & Verification  
📁 `FSE_MockTesting/com.mockdemo`, `com.mockverify`

#### ✅ Exercise 1: Mocking and Stubbing  
🔹 Mocks `ExternalApi`  
🔹 Uses `when(...).thenReturn(...)`

#### ✅ Exercise 2: Verifying Interactions  
🔹 Verifies method was called with expected args

---

## 🛠 Technologies Used

- Java 17 / 21
- Oracle SQL Developer (PL/SQL)
- Eclipse IDE
- Maven
- JUnit 4.13 / 5.x
- SLF4J & Logback
- Mockito 4.x
- Git & GitHub

---

## 🚀 How to Run

### 🟢 Java Projects

```bash
git clone https://github.com/MonigaBala/DigitalNurture-Java-FSE.git

1. Open Eclipse → File → Import → Maven > Existing Maven Projects

2. Navigate to test/main classes

3. Run as:

   -> Java Application for logic classes

   -> JUnit Test for testing classes

🔵 PL/SQL Scripts
1. Open Oracle SQL Developer

2. Enable DBMS_OUTPUT

3. Run .sql files from FSE_ControlStructures_Exercise/code/

4. Copy terminal output to matching .txt files in output/ folder

👩‍💻 Author
Moniga Balasubramanian
📧 monigabala1207@gmail.com
🎓 Java FSE Trainee – Cognizant Digital Nurture 4.0

📅 Submission Summary
Week	Focus Areas	Status
01	Core Java, Recursion, Design Patterns	✅ Done
02	PL/SQL, Stored Procedures, JUnit, Mockito	✅ Done

✅ Thank you for reviewing!
