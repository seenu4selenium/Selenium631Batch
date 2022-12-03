package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyPageURL {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.justrechargeit.com/");
		// Want to get the current page URL
		String homeurl = driver.getCurrentUrl();
		System.out.println(homeurl);

		// Click on Create New Account link
		driver.findElement(By.linkText("Create New Account")).click();
		// Want to get the current page URL
		String CreateNewAccountURL = driver.getCurrentUrl();
		System.out.println(CreateNewAccountURL);
		
		//Validate SignUp word is there or not in CreateNewAccountURL
		if (CreateNewAccountURL.contains("SignUp")) {
			System.out.println("SignUp page opened susscessfully, test cases is pass");
		} else {
			System.out.println("SignUp page not opened, test cases is fail");
		}
		
		
		//Without fill any data, click on CreateAccount button,
		driver.findElement(By.name("imgbtnSubmit")).click();
		Thread.sleep(3000);
		//then get the Error Message and Print into Console
		String nameErroMsg = driver.findElement(By.id("nameTD")).getText();
		System.out.println(nameErroMsg);

	}

}
