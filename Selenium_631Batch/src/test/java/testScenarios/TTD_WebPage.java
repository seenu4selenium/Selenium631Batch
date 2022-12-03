package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TTD_WebPage {
	// Create an object for Webdriver Interface
	// Use
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// Call Chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();

		// Type URL in a browser
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		Thread.sleep(6000);

		WebElement fn = driver.findElement(By.name("fName"));
		
		fn.sendKeys("h2otestingtools");
		Thread.sleep(2000);
		fn.clear();
		Thread.sleep(2000);
		fn.sendKeys("MyName");
		Thread.sleep(2000);
		
		//To close current Window
		//driver.close();
		driver.quit();

	}
}
