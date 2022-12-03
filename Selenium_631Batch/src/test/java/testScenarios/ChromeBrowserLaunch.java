package testScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver;
		//System.setProperty(Key, PathOftheBrowserDriverFile);
//		System.setProperty("webdriver.chrome.driver",".\\browserDrivers\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		
		//Edge browser
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		driver.get("https://www.justrechargeit.com/");
	}

}
