## Technology Stack

   1.Модная Java 16.0.1 
   2.Maven 3.8.3 
   3.Selenium 4.1.0 
   4.WebDriverManager 5.1.0

## Maven Homework

   1. Check available updates for libraries

#### mvn versions:display-dependency-updates
   2. Generic run of all tests
#### mvn clean test
   3.Generic run of all tests
#### mvn clean test
   4.Run tests of only a specific class (for example, LoginTest)
#### mvn test -Dtest=LoginTest
   5.Running a specific test from a specific class (e.g. a test from a class)
#### mvn test -Dtest=UserInfoTest#zipCodeShouldByRequired
   6.Run all tests with a single parameter defined (For example, password: secret_sauce)
#### mvn test -Dpassword=secret_sauce
   7.Running the differenf_browser.xml file
#### mvn clean test -DsuiteXmlFile=src/test/resources/differenf_browser.xml

