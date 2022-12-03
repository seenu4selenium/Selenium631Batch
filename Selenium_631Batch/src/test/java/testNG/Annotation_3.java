package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotation_3 {
	@Test // Actual functionality
	public void f() {
		System.out.println("@Test f");
	}
	@Test // Actual functionality
	public void m() {
		System.out.println("@Test m");
	}

	@BeforeClass // Pre-condition
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}
	
	@Test // Actual functionality
	public void a() {
		System.out.println("@Test a");
	}
	

	@AfterClass /// Post-condition
	public void afterClass() {
		System.out.println("@AfterClass");
	}

}
