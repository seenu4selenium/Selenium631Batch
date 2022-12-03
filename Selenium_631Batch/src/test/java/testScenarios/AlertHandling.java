package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// Maximize the window
		driver.manage().window().maximize();

		// Type URL in a browser
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(2000);
		
		//Verify the CONTINUE TO LOGIN  webelement is displayed or not?
		//if (driver.findElement(By.linkText("CONTINUE TO LOGIN1")).isDisplayed()) {
		if (driver.findElements(By.linkText("CONTINUE TO LOGIN")).size()>0) {
			System.out.println("The given element is displayed on Screen");
		} else {
			System.out.println("The given element is NOT displayed on Screen");
		}

//		// Click on CONTINUE TO LOGIN hyperlink
//		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
//		Thread.sleep(2000);
//
//		// Click on Login button without fill any data
//		driver.findElement(By.id("Button2")).click();
//		Thread.sleep(2000);
//
//		// Alert handling
//		// Get the alert Text message		
//		System.out.println(driver.switchTo().alert().getText());
//		// Click on OK button on alert
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		
//		
//
//		// Click on Register hyperlink without fill any data
//		driver.findElement(By.partialLinkText("Register")).click();
//		Thread.sleep(2000);
//		// Get the alert Text message
//		System.out.println(driver.switchTo().alert().getText());
//		// click on OK on Confirmation alert
//		//driver.switchTo().alert().accept();
//		
//		// click on Cancle on Confirmation alert
//		 driver.switchTo().alert().dismiss();
	}

}
