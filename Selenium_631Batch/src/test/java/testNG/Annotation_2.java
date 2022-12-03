package testNG;

import org.testng.annotations.Test;

public class Annotation_2 {
	@Test(priority = 3)
	public void z() {
		System.out.println("@Test z");
	}

	@Test(priority = 1)
	public void f() {
		System.out.println("@Test f");
	}

	@Test(priority = 2)
	public void a() {
		System.out.println("@Test a");
	}

	@Test(priority = 0)
	public void c() {
		System.out.println("@Test c");
	}

}
