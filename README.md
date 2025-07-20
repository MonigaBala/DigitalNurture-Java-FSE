💻 Cognizant DeepSkilling – Java FSE Track
This repository contains Java and PL/SQL assignments completed as part of the Digital Nurture 4.0 - Java FSE DeepSkilling Program at Cognizant.

Each assignment follows clean OOP practices, modular structure, and demonstrates key concepts using Java, PL/SQL, testing tools, ORM frameworks (JPA, Hibernate), and Spring Boot.

✅ Week 01 Submissions
➡️ Focus: Core Java, OOP, Recursion, Factory & Singleton Design Patterns
➡️ Packages: com.forecasting, com.factorymethods, com.ecommerce, com.singleton

1️⃣ Financial Forecasting Tool
📁 com.forecasting.*
🔹 Uses recursion and tail recursion to forecast future investment value
🔹 Validates user input for robustness
🔹 Console-based input/output

2️⃣ Factory Pattern - PDF/Word Document Generator
📁 com.factorymethods.*
🔹 Demonstrates the Factory Design Pattern
🔹 Generates PDF and Word documents using interfaces and concrete classes

3️⃣ E-commerce Product Search
📁 com.ecommerce.*
🔹 Accepts product details
🔹 Allows keyword-based product search
🔹 Uses arrays and filtering logic

4️⃣ Singleton Pattern Implementation
📁 com.singleton.*
🔹 Implements Singleton Design Pattern
🔹 Ensures only one instance
🔹 Used in scenarios like config, logging, etc.

✅ Week 02 Submissions
➡️ Focus: PL/SQL Blocks, Stored Procedures, JUnit Testing, SLF4J Logging, Mockito Mocking
➡️ Folders: FSE_ControlStructures_Exercise, FSE_JUnitTesting, FSE_LoggingExercise, FSE_MockTesting

📦 1️⃣ PL/SQL Assignments – Control Structures
📁 FSE_ControlStructures_Exercise/code/, output/

Scenario 1: Interest Rate Discount
Scenario 2: Promote to VIP
Scenario 3: Loan Due Reminders
🔧 2️⃣ PL/SQL Stored Procedures
📁 FSE_ControlStructures_Exercise/code/, output/

ProcessMonthlyInterest, UpdateEmployeeBonus, TransferFunds
Handles interest application, bonus updates, and fund transfers with validations
🧪 3️⃣ JUnit Testing
📁 FSE_JUnitTesting/com.testdemo, com.aaademo
🔹 Setup, assertions, AAA structure, and fixtures using @Before / @After

📋 4️⃣ SLF4J Logging
📁 FSE_LoggingExercise/com.logging.example
🔹 Logs warnings and errors with custom messages
🔹 Simulates runtime exceptions using Logback

🔁 5️⃣ Mockito Mocking & Verification
📁 FSE_MockTesting/com.mockdemo, com.mockverify
🔹 Mocks external APIs and verifies interactions

✅ Week 03 Submissions
➡️ Focus: JPA, Hibernate, Spring Data JPA, ORM Implementation, Entity Relationships
➡️ Packages: com.jpaexample, com.hibernateexample, com.springdatajpaexample
➡️ Folders: Week03/FSE_JPA_ORM/code/, output/

1️⃣ Country Retrieval using Spring JPA
📁 com.springdatajpaexample
🔹 Retrieves a list of countries from MySQL using JpaRepository
🔹 Configured with application.properties
🔹 Executed in main() with logging and DB output

2️⃣ One-to-Many Mapping – Department & Employee
📁 com.jpaexample.onetomany
🔹 Department → List<Employee> mapping using @OneToMany
🔹 Demonstrates cascading persist
🔹 JPA annotations for entity relationships

3️⃣ Many-to-Many Mapping – Student & Course
📁 com.jpaexample.manytomany
🔹 Students and Courses linked with @ManyToMany + @JoinTable
🔹 Demonstrates association table usage

4️⃣ One-to-One Mapping – Employee & Address
📁 com.jpaexample.onetoone
🔹 @OneToOne mapping
🔹 Employee has a unique address
🔹 Demonstrates bidirectional mapping

5️⃣ JPA vs Hibernate vs Spring Data JPA
📁 com.hibernateexample, com.springdatajpaexample
🔹 Includes a comparative explanation and code snippets
🔹 Manual Session handling (Hibernate) vs JpaRepository abstraction
🔹 Highlights boilerplate reduction with Spring Data JPA
🔹 Includes proper transactional annotations

🧾 Output files for all Week 03 exercises are stored in:
📂 Week03/FSE_JPA_ORM/output/

✅ Week 04 Submissions
➡️ Focus: Spring Boot REST API Development
➡️ Folders: 04_Spring REST using Spring Boot 3

1️⃣ Spring Web Project Setup with Maven
📁 01_Create a Spring Web Project using Maven
🔹 Spring Boot project generated via Spring Initializr
🔹 Includes basic controller and startup config

2️⃣ Load Country from Spring Configuration XML
📁 02_Spring Core – Load Country from Spring Configuration XML
🔹 Demonstrates Spring ApplicationContext loading
🔹 XML-based bean configuration

3️⃣ REST – GET All Countries
📁 03_REST – GET All Countries
🔹 Controller to return list of countries
🔹 Uses country.xml as data source

4️⃣ REST – GET Country by Code
📁 04_REST – GET Country by Code
🔹 REST endpoint to fetch country by code
🔹 Case-insensitive lookup using Java Streams

5️⃣ Authentication Service for JWT Token
📁 05_Create authentication service that returns JWT
🔹 Credentials authenticated from HTTP Basic Auth
🔹 Returns JWT token using secret and expiry

✅ Week 05 Submissions
➡️ Focus: Microservices with Spring Boot
➡️ Folders: 05_Microservices with Spring Boot 3 and Spring Cloud

1️⃣ Account Microservice
📁 account/
🔹 Spring Boot REST application
🔹 Endpoint: GET /accounts/{number}
🔹 Returns static dummy account response

2️⃣ Loan Microservice
📁 loan/
🔹 Spring Boot REST application
🔹 Endpoint: GET /loans/{number}
🔹 Returns static dummy loan response
🔹 Configured to run on port 8081 to avoid conflict

✅ Week 06 Submissions ➡️ Focus: ReactJS Fundamentals – JSX, Components, Props, State, Lifecycle, Styling ➡️ Folders: 06_React/02_ReactJS-HOL/Code/

1️⃣ First React App – JSX Demo 📁 myfirstreact/ 🔹 Created using create-react-app 🔹 Rendered a welcome message using JSX syntax 🔹 Displayed output: “Welcome to the first session of React”

2️⃣ Class Components – Student Management Portal 📁 StudentApp/ 🔹 Built three separate class components: Home, About, Contact 🔹 Rendered all components inside App.js 🔹 Demonstrated usage of render() and JSX return in class-based components

3️⃣ Functional Component – Score Calculator 📁 scorecalculatorapp/ 🔹 Created a stateless functional component with props 🔹 Displayed student information and calculated average score 🔹 Applied styles using an external CSS file (mystyle.css)

4️⃣ Lifecycle Methods & API Fetch – Blog App 📁 blogapp/ 🔹 Used class component lifecycle methods: componentDidMount() & componentDidCatch() 🔹 Fetched dummy blog posts using fetch() API call from jsonplaceholder.typicode.com 🔹 Rendered a list of post titles and bodies dynamically 🔹 Handled fetch errors gracefully

5️⃣ Styling with CSS Modules and Inline Styles 📁 cohortdashboardapp/ 🔹 Styled a component using a CohortDetails.module.css file 🔹 Used scoped CSS class (box) for layout 🔹 Applied conditional inline styles for heading color based on cohort status (green if ongoing, blue otherwise) 🔹 Used semantic tags like <dl>, <dt>, <dd> to structure  cohort details 🔹 Matched UI layout with the sample output provided in lab

🛠 Technologies Used
Java 17 / Java 21
Oracle SQL Developer (PL/SQL)
Eclipse IDE
Maven
Spring Boot 3.5.3
JUnit 4.13 / 5.x
Mockito 4.x
SLF4J & Logback
Git & GitHub
MySQL 8.0

🚀 How to Run
🟢 Java Projects
git clone https://github.com/MonigaBala/DigitalNurture-Java-FSE.git
1. Open Eclipse → File → Import → Maven > Existing Maven Projects
2. Navigate to your desired exercise folders
3. Right-click → Run As → Java Application or JUnit Test

🔵 PL/SQL Scripts

1. Open Oracle SQL Developer
2. Enable DBMS_OUTPUT
3. Run .sql files from FSE_ControlStructures_Exercise/code/
4. Copy results to .txt files inside output/ folder

👩‍💻 Author:
Moniga Balasubramanian
📧 monigabala1207@gmail.com
🎓 Java FSE Trainee – Cognizant Digital Nurture 4.0

📅 Submission Summary
Week	Focus Areas	Status
01	Core Java, Recursion, Design Patterns	✅ Done
02	PL/SQL, Stored Procedures, JUnit, Mockito	✅ Done
03	JPA, Hibernate, Spring Data JPA, ORM Mapping	✅ Done
04	Spring Boot REST APIs	✅ Done
05	Microservices with Spring Boot	✅ Done
06  React      Done
✅ Thank you for reviewing! 
