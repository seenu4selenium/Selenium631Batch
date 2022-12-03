package testNG;

import org.testng.annotations.Test;

public class TestNG_Groups {

	@Test(groups = { "Sanity", "Retesting" })
	public void tc_05() {
		System.out.println("tc_05");
	}

	@Test(groups = {"Retesting","Regression"})
	public void tc_01() {
		System.out.println("tc_01");
	}

	@Test(groups = { "Sanity", "Regression" })
	public void tc_03() {
		System.out.println("tc_03");
	}

	@Test(groups = "Regression")
	public void tc_02() {
		System.out.println("tc_02");
	}

	@Test(groups = "Sanity")
	public void tc_04() {
		System.out.println("tc_04");
	}
}
