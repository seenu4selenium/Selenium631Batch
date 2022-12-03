package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exam {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// Maximize the window
		driver.manage().window().maximize();

		// Type URL in a browser
		driver.get("file:///C:/Users/nalla/Desktop/Exam_14Oct2022/QE%20-%20index.html");
		Thread.sleep(2000);
		// Verify the Email webelement is displayed or not?
		if (driver.findElements(By.id("inputEmail")).size() > 0) {
			System.out.println("The given element is displayed on Screen");
		} else {
			System.out.println("The given element is NOT displayed on Screen");
		}
		
	}
}
