package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElement {
	WebDriver driver;

	@Test
	public void f() {
		driver = new ChromeDriver();
		driver.get("https://www.platformqedu.com/");
		driver.manage().window().maximize();
		
		//Create an object for Action Interface
		Actions act = new Actions(driver);
		
		//Move mouse pointer to ABOUT menu
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-15599\"]/a/span[1]"))).perform();
		//Click on Team menu
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-15435\"]/a/span"))).click().perform();
		
		
		

	}
}
