package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Wait statement
		Thread.sleep(5000);
		
		//Type some text to username editbox
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//Click on Login button
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(5000);
		
		//Click on Profile icon
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		
		Thread.sleep(5000);
		//Click on Logout link
		driver.findElement(By.linkText("Logout")).click();
		
		
		
	}

}
