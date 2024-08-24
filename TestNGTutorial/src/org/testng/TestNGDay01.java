package org.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDay01 {
// in single class we can define multiple test cases with help of testNG annotation
	
// Collection of test folders is nothing but test suites
	
	// in xml file inside the test folder we define our test case class where exactly all test cases are stored
	// in xml file inside classes we can define multiple class like package name.classname
	// we can modularize the testcases based upon functionality and trigger them accordingly
	// using exclude we can ignore specific test cases 
// eg.. if we have multiple test case begins with same name called mobilelogin or any if dont need to validate then simply use regular expression mobilelogin* using this we can exclude 
	
	// using paramenter in testng xml file we can pass value where we want by parameter keyword

@Parameters({"URL"})	
@Test
public void demo(String url) {
	
	System.out.println("HelloTestNG");
	
}

@Test
public void secondTestCase() {

	System.out.println("Bye");

}


	
}
