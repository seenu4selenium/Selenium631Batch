package testScenarios;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestABC {
	WebDriver driver;

	// Default Constructor
	public TestABC() {	
		this.driver = driver;
		System.out.println("TestABC Constructor");
	}

	public  void subMethod() {
		System.out.println("subMethod");
	}

	@Test
	public  void test() {
		System.out.println("Main method");
		subMethod();
	}

}
