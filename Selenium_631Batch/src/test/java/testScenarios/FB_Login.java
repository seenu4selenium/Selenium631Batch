package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_Login {
	// Create an object for Webdriver Interface
	// Use
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// Call Chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Type URL in a browser
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("h2otestingtools@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Testing@123");
		driver.findElement(By.name("login")).click();
		// Wait for page load
		Thread.sleep(10000);// 1000 ms = 1 sec

		// Logout
		driver.findElement(By.xpath("//*[@aria-label='Your profile']")).click();
		Thread.sleep(3000);
		
		String logoutXpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]";
		driver.findElement(By.xpath(logoutXpath)).click();


	}
}
