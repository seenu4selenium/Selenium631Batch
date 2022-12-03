package testNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class FB_Login_Retesting_WithDataProvider {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	@Test(dataProvider = "abc")
	public void retest(String username, String password) {

		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		// driver.findElement(By.name("login")).click();
	}

	@Test(dataProvider = "mno")
	public void retest1(int a, int b) {
		System.out.println((a + b));
		System.out.println((a - b));
		System.out.println((a * b));
	}

	@DataProvider
	public Object[][] abc() {
		return new Object[][] { new Object[] { "abdcafdsf32432@gmail.com", "325345fdga" },
				new Object[] { "yevcdsf32432@gmail.com", "eryf325345fdga" },
				new Object[] { "uwadsf32432@gmail.com", "ydfyf325345fdga" }, };
	}

	@DataProvider
	public Object[][] mno() {
		return new Object[][] { new Object[] { 23, 343 }, new Object[] { 54534, 345 }, };
	}
}
