package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseVsQuit {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// Call Chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// Maximize the window
		driver.manage().window().maximize();

		// Type URL in a browser
		driver.get("https://demoqa.com/browser-windows");
		
		//Click on windowButton button
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(6000);
		//New Window opened, Want to Close parent window
		//Close(): Close the current window, But the backgound chrome will not close from TaskManager
		//driver.close();

		//Quit(): Close the current window as well as related windows.
		//the backgound chrome will close from TaskManager.
		driver.quit();
	}

}
