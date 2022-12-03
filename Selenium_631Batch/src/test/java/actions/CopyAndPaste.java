package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyAndPaste {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to the demo site
		driver.get("https://demoqa.com/text-box");

		// Enter the Full Name
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Mr.Sreenivas");
		Thread.sleep(2000);
		// Enter the Email
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("Sreenivas@gmail.com");
		Thread.sleep(2000);
		// Enter the Current Address
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("43 School Lane London EC71 9GO");
		Thread.sleep(2000);
		Actions act = new Actions(driver);

		// Copy the Current Address
		act.moveToElement(currentAddress)
		.keyDown(Keys.CONTROL).sendKeys("A").build().perform();
		Thread.sleep(2000);
		
		act.moveToElement(currentAddress)
		.keyDown(Keys.CONTROL).sendKeys("C").build().perform();
		
		Thread.sleep(2000);
		// Press the TAB Key to Switch Focus to Permanent Address
		act.sendKeys(Keys.TAB).build().perform();

		// Paste the Address in the Permanent Address field
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		act.moveToElement(permanentAddress)
		.keyDown(Keys.CONTROL).sendKeys("V").build().perform();
	}
}
