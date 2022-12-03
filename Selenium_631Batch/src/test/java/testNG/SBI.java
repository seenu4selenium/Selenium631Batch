package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SBI {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		//Chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Edge browser
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		
		//Firefox browser
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Type URL in a browser
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(2000);

		// Verify the CONTINUE TO LOGIN webelement is displayed or not?
		// if (driver.findElement(By.linkText("CONTINUE TO LOGIN1")).isDisplayed()) {
		if (driver.findElements(By.linkText("CONTINUE TO LOGIN")).size() > 0) {
			System.out.println("The given element is displayed on Screen");
		} else {
			System.out.println("The given element is NOT displayed on Screen");
		}
	}
}
