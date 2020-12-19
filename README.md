mvninzSuite# JUnit_TestNG-Maven

1. Add JUnit or TestNg dependency in POM file
2. Add maven-surefire plugin in POM file

3. Go to src/main/java/application and open Calculator class
4. Implement all methods with TODO comments

//***************Simple methods***************

//TODO add method for subtraction

//TODO add method for multiplication

//TODO add method for division

//TODO add method for square root (use Math class)

//TODO add method for x^2

//***************Medium methods***************

//TODO (*) |average value| add method which calculate average value of 3 numbers

//TODO (*) |even or odd| add method which get 1 number as parameter and return true if it even, and false - if odd

//TODO (*) |biggest value| add method which get 2 number as parameters and return bigger of them, or 0 if they equals

//***************Hard methods***************

//TODO (**) |addition with multiple parameters| add method which return sum of any quantity of parameter

//TODO (*) |divide by zero case| add method for division (check division by zero case
// - if we try to divide by zero - return -100;

5. Go to the test/java/simpleTask and open SimpleTestClass
6. Create test for all simple methods from Calculator class


7. Go to the test/java/mediumTask and open MediumTestClass
8. Create test for all medium methods from Calculator class

9. Go to the test/java/hardTask and open HardTestClass
10. Create test for all medium methods from Calculator class

************************************************************

11. Run all tests from maven
13. Run only tests from HardTestClass
14. Run tests from HardTestClass and SimpleTestClass

************************************************************

15. If you pick JUnit:<br />
Add category "Regression" for all tests in SimpleTestClass<br />
Add category "Smoke" for all tests in MediumTestClass<br />
Add category "Regular" for all tests in HardTestClass<br />
run only Smoke and Regression tests using runner class<br />

16. If you pick TestNG:<br />
Add group "Regression" for 1 test in SimpleTestClass<br />
Add group "Smoke" for 1 test in MediumTestClass<br />
Create testng.xml file<br />
Configure testng.xml file as:<br />
all tests from HardTestClass should be run<br />
test with Regression group should be run<br />
test with Smoke group should be run<br />

