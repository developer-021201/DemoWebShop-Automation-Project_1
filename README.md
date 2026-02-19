📘 PROJECT SYNOPSIS
    Project Title: Automation Testing of Demo Web Shop using Selenium WebDriver with Java
________________________________________
 Introduction
Software testing plays a vital role in ensuring the quality, reliability, and performance of web applications. Manual testing is time-consuming and error-prone, especially when repetitive regression tests are required. Automation testing solves this problem by executing test cases automatically using tools and frameworks.
This project focuses on automating the testing of an e-commerce website, Demo Web Shop, using Selenium WebDriver with Java and TestNG framework. The automation framework follows the Page Object Model (POM) design pattern to ensure modularity, reusability, and maintainability.
________________________________________
 Objective of the Project
The main objectives of this project are:
•	To automate key functionalities of an e-commerce website.
•	To reduce manual testing effort.
•	To validate user workflows like registration, login, cart operations.
•	To implement Selenium framework using Java.
•	To apply TestNG for structured test execution.
•	To design a maintainable automation framework using POM.
________________________________________
 Tools & Technologies Used
Tool / Technology	Purpose
Java	Programming language
Selenium WebDriver	Automation tool
TestNG	Test execution framework
Maven	Dependency management
WebDriverManager	Driver management
Eclipse / IntelliJ	IDE
Chrome Browser	Test execution
________________________________________
 Application Under Test
Website: http://demowebshop.tricentis.com/
Domain: E-Commerce
The website provides features like:
•	User Registration
•	Login/Logout
•	Product selection
•	Add to cart
•	Shopping cart management
________________________________________
 Modules Automated
The following 4 modules were automated:
________________________________________
🔹 1. Register Module
Description:
This module validates the user registration functionality.
Test Scenario:
•	Click on Register
•	Enter user details
•	Submit registration form
•	Verify successful registration
Validation Points:
•	User can register successfully.
•	Error message shown for duplicate email.
________________________________________
🔹 2. Login Module
Description:
This module verifies user login functionality.
Test Scenario:
•	Click on Login
•	Enter valid email and password
•	Click Login button
•	Verify successful login
Validation Points:
•	Successful login with valid credentials.
•	Error message with invalid credentials.
________________________________________
🔹 3. Add to Cart Module
Description:
This module automates product selection and adding to cart.
Test Scenario:
•	Navigate to product category
•	Select product
•	Click Add to Cart
•	Verify success notification
Validation Points:
•	Product successfully added to cart.
•	Cart count updated correctly.
________________________________________
🔹 4. Shopping Cart Module
Description:
This module verifies cart operations.
Test Scenario:
•	Open shopping cart
•	Update product quantity
•	Verify updated total price
Validation Points:
•	Quantity updated correctly.
•	Total price recalculated properly.
________________________________________
6️⃣ Framework Design
The framework follows:
🔹 Page Object Model (POM)
Each web page has a separate class:
•	RegisterPage.java
•	LoginPage.java
•	ProductPage.java
•	CartPage.java
🔹 Base Class
•	BaseTest.java
•	Handles browser setup and teardown
•	Common reusable configuration
🔹 Test Classes
•	RegisterTest.java
•	LoginTest.java
•	AddToCartTest.java
•	CartTest.java
🔹 testng.xml
•	Controls execution of test cases
•	Allows running multiple tests together

Key Features of the Framework
•	Modular design
•	Reusable code
•	Clear separation of test logic and page logic
•	Easy maintenance
•	Test execution using TestNG
•	Maven dependency management
________________________________________
 Advantages of Automation in This Project
•	Reduces manual effort
•	Faster execution
•	Reusable test cases
•	Suitable for regression testing
•	Improves software quality

Conclusion
This project successfully demonstrates automation of an e-commerce web application using Selenium WebDriver with Java. The framework built using Page Object Model ensures scalability and maintainability. The automation suite validates critical user workflows such as registration, login, adding products to cart, and managing shopping cart.
The project enhances understanding of automation testing concepts, Selenium framework design, and real-time web application testing practices.


