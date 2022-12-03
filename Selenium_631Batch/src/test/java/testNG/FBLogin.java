package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLogin {
	WebDriver driver;

	// Open Chrome Browser and type URL(FB)
	@Test
	public void tc_01() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Type URL in a browser
		driver.get("https://www.facebook.com/");
	}

	// Type valid credentials then click on Login button
	@Test
	public void tc_02() {
		driver.findElement(By.name("email")).sendKeys("h2otestingtools@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Testing@123");
		driver.findElement(By.name("login")).click();
	
	}

//	// Wait for few sec then click on Logout button
//	@Test
//	public void tc_03() throws Exception {
//		// Logout
//		driver.findElement(By.xpath("//*[@aria-label='Your profile']")).click();
//		Thread.sleep(3000);
//
//		String logoutXpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]";
//		driver.findElement(By.xpath(logoutXpath)).click();
//
//	}
}
