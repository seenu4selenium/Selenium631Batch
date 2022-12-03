package testScenarios;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Exam {
	static WebDriver driver;
	static String URL = "C:\\Users\\nalla\\Desktop\\Exam_14Oct2022/QE%20-%20index.html";

	public static void launchURL() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}

	public static void verifyWebElement(By locator) {
		if (driver.findElement(locator).isDisplayed()) {
			System.out.println("locator has displayed on current page, Test case PASS");
		} else {
			System.out.println("locator has NOT displayed on current page, Test case FAIL");
		}
	}

	public static void test1() {
		launchURL();
//		Assert that both the email address and password inputs are present as well as the login button		
		verifyWebElement(By.id("inputEmail"));
		verifyWebElement(By.id("inputPassword"));
		verifyWebElement(By.xpath("//*[@id='test-1-div']/form/button"));

		// Enter in an email address and password combination into the respective fields
		driver.findElement(By.id("inputEmail")).sendKeys("adfvajsfgkd@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("sajhdfjsgfjsh");

		System.out.println("Test 1, PASS*************************");
	}

	public static void test2() {
		launchURL();
//		In the test 2 div, assert that there are three values in the listgroup
		ArrayList<WebElement> allElementsinList = new ArrayList<WebElement>(
				driver.findElements(By.xpath("//*[@id='test-2-div']/ul")));
		// Print all the values in the list group using FOREACH loop
		for (WebElement abc : allElementsinList) {
			System.out.println(abc.getText());
		}

//		Assert that the second list item's value is set to "List Item 2"
		String secondValue = driver.findElement(By.xpath("//*[@id='test-2-div']/ul/li[2]")).getText();
		System.out.println("the secondValue is: " + secondValue);
		if (secondValue.contains("List Item 2")) {
			System.out.println("Test case Pass");
		} else {
			System.out.println("Test case Fail");
		}
//		Assert that the second list item's badge value is 6
		if (secondValue.contains("6")) {
			System.out.println("Test case Pass");
		} else {
			System.out.println("Test case Fail");
		}
	}

	public static void test3() {
		launchURL();
		String test3FirstOption = driver.findElement(By.id("dropdownMenuButton")).getText();
		System.out.println(test3FirstOption);
		if (test3FirstOption.equals("Option 1")) {
			System.out.println("Test case Pass");
		} else {
			System.out.println("Test case Fail");
		}
		// Select "Option 3" from the select list
		driver.findElement(By.id("dropdownMenuButton")).click();
		driver.findElement(By.linkText("Option 3")).click();
	}

	public static void test4() {
		launchURL();
		// In the test 4 div, assert that the first button is enabled and that the
		// second button is disabled

		// isEnabled(): system will check the given locator is enable state or not?
		// if it is enabled state(clickble), then the results of element is TRUE
		if (driver.findElement(By.xpath("//*[@id='test-4-div']/button[1]")).isEnabled()) {
			System.out.println("Given locator is Enabled state*");
		} else {
			System.out.println("Given locator is Disabled state*");
		}

		if (driver.findElement(By.xpath("//*[@id='test-4-div']/button[2]")).isEnabled()) {
			System.out.println("Given locator is Enabled state**");
		} else {
			System.out.println("Given locator is Disabled state**");
		}

	}

	public static void test5() throws Exception {
		launchURL();
		Thread.sleep(5000);
		if (driver.findElement(By.id("test5-button")).isDisplayed()) {
			System.out.println("locator has displayed on current page, Test case PASS");
			driver.findElement(By.id("test5-button")).click();
		} else {
			System.out.println("locator has NOT displayed on current page, Test case FAIL");
		}
		
		//Validate success message has displayed or not?
		if(driver.findElement(By.id("test5-alert")).isDisplayed()) {
			System.out.println("locator has displayed on current page, Test case PASS");
		} else {
			System.out.println("locator has NOT displayed on current page, Test case FAIL");
		}
		
		if (driver.findElement(By.id("test5-button")).isEnabled()) {
			System.out.println("Given locator is Enabled state***,Test case FAIL");
		} else {
			System.out.println("Given locator is Disabled state***,Test case PASS");
		}
		
	}
	public static void test6() throws Exception {
		launchURL();
		Thread.sleep(5000);
	}
	

	public static void main(String[] args) throws Exception {
		// test1();
		// test2();
		// test3();
		//test4();
		//test5();
		test6();
	}

}
