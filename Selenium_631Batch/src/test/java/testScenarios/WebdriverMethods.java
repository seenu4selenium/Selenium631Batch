package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverMethods {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		//Want to get the current page URL
		String url =  driver.getCurrentUrl();
		System.out.println(url);
		
		//System.out.println(driver.getCurrentUrl());
		
		//Get the Title of the current page
		System.out.println(driver.getTitle());
		System.out.println("***************************************");
		
		driver.findElement(By.name("email")).sendKeys("h2otestingtools@gmail.com");
		Thread.sleep(3000);
		
		//Click on Refresh icon Left top corner
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
		
		//Click on Forgot password? hyperlink
		driver.findElement(By.linkText("Forgot password?")).click();
		//driver.findElement(By.partialLinkText("ord?")).click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		
		//Click on BACK icon Left top corner
		driver.navigate().back();
		Thread.sleep(3000);
		
		//Click on Forward icon Left top corner
		driver.navigate().forward();
		
		
		
//		driver.get("https://www.google.com/");
//		//Click on Gmail link
//		//driver.findElement(By.linkText("Gmail")).click();
//		driver.findElement(By.partialLinkText("mag")).click();

		
		driver.quit();
		
	}

}
