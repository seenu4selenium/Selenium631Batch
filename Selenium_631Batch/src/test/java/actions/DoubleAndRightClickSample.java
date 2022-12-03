package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleAndRightClickSample {
	WebDriver driver;

	@Test
	public void f() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		// Create an object for Action Interface
		Actions act = new Actions(driver);

		// Do double click on Emenet
		act.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
		// Get the alert text
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		Thread.sleep(2000);
		// and click on OK button on alert
		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		// Do right click on element
		act.contextClick(driver.findElement(By.xpath("//*[text()='right click me']"))).perform();

	}
}
