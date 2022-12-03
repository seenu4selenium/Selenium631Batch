package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsInTestNG {
	String a = "Hi";
	String b = "Hello";
	//@Test
	public void verification() {
		System.out.println("Before Verification");
		if (a.equals(b)) {
			System.out.println("if block executed");
		} else {
			System.out.println("else block executed");
		}
		System.out.println("After Verification");
	}
	// Assertion: TestNG verification
	//Hard Assertion:
	//System will compare the actualValue & expectedValue, if two were match, then the result is PASS
	//Asserts that two Strings are equal. If they are not, an AssertionError is thrown.

	//@Test
	public void HardAssertion() {
		System.out.println("Before HardAssertion");
		Assert.assertEquals(a, b);
		System.out.println("After HardAssertion");
	}
	
	//Soft Assertion
	@Test
	public void SoftAssertion() {
		//Create an SoftAssertion object
		SoftAssert sa = new SoftAssert();
		System.out.println("Before SoftAssertion");
		sa.assertEquals(a, b);
		System.out.println("After SoftAssertion");
		sa.assertAll();
	}
	
}
