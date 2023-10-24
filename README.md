# ITbootcamp_web_automation_selenium_project

Selenium Test Automation Project - My Awesome App
This project showcases automated testing using Selenium WebDriver, Maven, and TestNG. It follows the Page Object Model (POM) design pattern, providing a structured approach for automating UI tests.
It was developed as a part of a web automation final project at IT Bootcamp.

Project Overview
The project is organized into various page classes, each representing different sections of the application:

Landing, Login, Signup, Profile, Navigation, Message Pop Up, and Cities: These page classes can be found in the src/main/java/pages directory. You can extend or modify them to accommodate changes in the application.

Test Scripts: Test scripts are located in the src/test/java/tests directory.

Test Categories
We have organized our tests into six main categories, each focused on specific functionality:

Login Tests
Verify login page functionality.
Test successful login.
Check error messages.
Validate input fields and buttons.
Signup Tests
Verify signup functionality.
Check error messages.
Test successful sign-up.
Validate input fields and buttons.
Admin Cities Tests
Test add, edit, and delete functionality for the cities page.
Auth Routes Tests
Test route protection in case the user is not authenticated.
Locale Tests
Verify the functionality of language buttons.
Check page content in different languages.
Profile Tests
Test profile page functionality.
Validate editing a user profile.
Check error messages and successful edits.
Requirements
Before running the tests, make sure you have the following dependencies installed:

Java Development Kit (JDK)
Maven
TestNG
Chrome WebDriver
Running the Tests
To run the TestNG suite from the command line, use the following command:

bash
Copy code
mvn clean test -Dsurefire.suiteXmlFiles=testng.xml
This command will execute the test cases defined in the testng.xml file.



Utilizing Java, Maven, Selenium, TestNG, and Git.
Implementing the Page Object Model (POM) for organized and maintainable test scripts.
Functional testing of the "My Awesome App" web application.
Test Scenarios
Our project includes 28 tests organized into six test scenarios:

Login Tests: Verifying user login functionality.
Signup Tests: Verifying user signup functionality.
Admin Cities Tests: Testing functionalities for creating, editing, and deleting cities.
Auth Routes Tests: Testing route protection for unauthenticated users.
Locale Tests: Testing page content in different languages.
Profile Tests: Testing profile page form and its functionalities.
You can find all the test cases for this project here.

Running Tests
Our tests are organized and implemented using the testng.xml file and can be executed from the command line using the following command:

bash
Copy code
mvn clean test -Dsurefire.suiteXmlFiles=testng.xml
This command will run the test cases defined in the testng.xml file.
