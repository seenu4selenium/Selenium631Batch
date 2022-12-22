package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadlessBrowser {
	@Test
	public void f() {
		WebDriver driver;
		driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("asuifhkj324cfds@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Testdsfing@123");

	}
}
