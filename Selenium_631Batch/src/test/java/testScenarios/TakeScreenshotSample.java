package testScenarios;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotSample {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
     	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Type URL in a browser
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("h2otestingtools@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("Testing@123");
//		driver.findElement(By.name("login")).click();
		
		
		//driver.get("https://www.google.com/");
		//Time stamp
		Date d = new Date();
		DateFormat abcd = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = abcd.format(d);

		//System will get the current screen as screenshot and store it into temp to RAM location
		File abc =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//From RAM location want to move it to specific folder, will use Selenium method FileHandler
		FileHandler.copy(abc,new File(".\\screenshots\\test_"+timeStamp+".png"));
	}

}
