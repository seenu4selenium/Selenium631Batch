package testScenarios;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Assessment_Code {
	// Create webdriver reference
	WebDriver driver;
	String URL = "C:\\Users\\nalla\\Desktop\\Exam_14Oct2022/QE%20-%20index.html";

	@BeforeClass
	public void beforeClass() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass // Close the current browser
	public void afterClass() {
		driver.quit();
	}

	//@AfterMethod
	public void afterMethod() throws Exception {
		// TakeScreenshot
		Date dt = new Date();
		DateFormat df = new SimpleDateFormat("MMMddyyyy_HHmmss");
		String timeStamp = df.format(dt);

		// System will take screenshot for the current screen then move the file to RAM
		// location
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// move above file to user location
		FileHandler.copy(abc, new File(".\\Screenshots\\" + "Test1" + timeStamp + ".PNG"));

	}

	@Test
	public void test1() {
		By Test1_Email = By.id("inputEmail");
		By Test1_Password = By.id("inputPassword");
		By Test1_Signin = By.xpath("//*[@id='test-1-div']/form/button");

		System.out.println("Test1*************************************************");
		// Navigate to the home page
		driver.get(URL);
		// Assert that both the email address and password inputs are present as well as
		// the login button
		if (driver.findElements(Test1_Email).size() > 0 && driver.findElements(Test1_Password).size() > 0
				&& driver.findElements(Test1_Signin).size() > 0) {
			System.out.println("email address and password inputs, login button all are displayed");
		} else {
			System.out.println("email address and password inputs, login button all are NOT displayed");
		}
		// Enter in an email address and password combination into the respective fields
		driver.findElement(Test1_Email).sendKeys("csairanjith@gmail.com");
		driver.findElement(Test1_Password).sendKeys("csairanjith");
		driver.findElement(Test1_Signin).click();

	}

	@Test
	public void test2() {
		System.out.println("Test2********************************************");
		// Navigate to the home page
		driver.get(URL);

//		In the test 2 div, assert that there are three values in the listgroup
		ArrayList<WebElement> test2Div = new ArrayList<WebElement>(
				driver.findElements(By.xpath("//*[@id='test-2-div']/ul")));
		System.out.println("test 2 div tag Values size is : " + test2Div.size());
		
		for (WebElement webElement : test2Div) {
			System.out.println(webElement.getText());
		}
//		Assert that the second list item's value is set to "List Item 2"

		String secondListItemName = driver.findElement(By.xpath("//*[@id='test-2-div']/ul/li[2]")).getText();
		if (secondListItemName.contains("List Item 2")) {
			System.out.println("The second list item's value is set to 'List Item 2' ");
		} else {
			System.out.println("Locator issue");
		}

//		Assert that the second list item's badge value is 6
		String secondListItembadgeValue = driver.findElement(By.xpath("//*[@id='test-2-div']/ul/li[2]/span")).getText();
		System.out.println("secondListItembadgeValue value is: " + secondListItembadgeValue);
		Assert.assertEquals("6", secondListItembadgeValue);
	}

	@Test
	public void test3() throws Exception {
		By Test3_Option1 = By.id("dropdownMenuButton");
		By Test3_Option3 = By.xpath("//*[@id='test-3-div']/div/div/a[3]");

		System.out.println("Test3****************************************");
		// Navigate to the home page
		driver.get(URL);
//		In the test 3 div, assert that "Option 1" is the default selected value
		String Test3_Option1_Value = driver.findElement(Test3_Option1).getText();
		Assert.assertEquals("Option 1", Test3_Option1_Value);

//		Select "Option 3" from the select list
		driver.findElement(Test3_Option1).click();
		Thread.sleep(3000);
		driver.findElement(Test3_Option3).click();

	}

	@Test
	public void test4() throws Exception {
		By Test4_Button1 = By.xpath("//*[@id='test-4-div']/button[1]");
		By Test4_Button2 = By.xpath("//*[@id='test-4-div']/button[2]");

		System.out.println("Test4****************************************");
		// Navigate to the home page
		driver.get(URL);
		// In the test 4 div, assert that the first button is enabled and that the
		// second button is disabled
		if (driver.findElement(Test4_Button1).isEnabled()) {
			System.out.println("Test4_Button1 is Enabled state,Test Case Pass");
		} else {
			System.out.println("Test4_Button1 is Disabled state,Test Case Fail");
		}

		if (driver.findElement(Test4_Button2).isEnabled()) {
			System.out.println("Test4_Button2 is Enabled state,Test Case Fail");
		} else {
			System.out.println("Test4_Button2 is Disabled state, Test Case Pass");
		}
	}

	@Test
	public void test5() throws Exception {
		By Test5_Button = By.id("test5-button");
		By Test5_SuccessMsg = By.id("test5-alert");

		System.out.println("Test5****************************************");
		// Navigate to the home page
		driver.get(URL);

//		In the test 5 div, wait for a button to be displayed (note: the delay is random)
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(50));
		ww.until(ExpectedConditions.elementToBeClickable(Test5_Button));
		// and then click it
		driver.findElement(Test5_Button).click();
		// implicit wait: Page Load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Once you've clicked the button, assert that a success message is displayed
		if (driver.findElements(Test5_SuccessMsg).size() > 0) {
			System.out.println("success message is displayed****, Test Case Pass");
		} else {
			System.out.println("success message is NOT displayed****, Test Case Fail");
		}
//		Assert that the button is now disabled
		if (driver.findElement(Test5_Button).isEnabled()) {
			System.out.println("Test5_Button is Enabled state,Test Case Fail");
		} else {
			System.out.println("Test5_Button is Disabled state, Test Case Pass");
		}

	}

	@Test
	public void test6() throws Exception {
		By Test5_Button = By.id("test5-button");
		By Test5_SuccessMsg = By.id("test5-alert");

		System.out.println("Test5****************************************");
		// Navigate to the home page
		driver.get(URL);

//	Use the method to find the value of the cell at coordinates 2, 2 (staring at 0 in the top left corner)
//	Assert that the value of the cell is "Ventosanzap"
		Assert.assertEquals("Ventosanzap", getCellDataByRowAndColumn(2, 2));
		/*
		 * java.lang.AssertionError: expected [Carswell] but found [Ventosanzap] //The
		 * results of 2,2 cell value in the grid is "Carswell" //The Assertion fails
		 * because Expected and actual is not the same values If the test case wants to
		 * match, use (3,3) values in the parameters.
		 */
		System.out.println("Test6 Pass***");
	}

//	Write a method that allows you to find the value of any cell on the grid
	public String getCellDataByRowAndColumn(int row, int column) {
		WebElement ele = driver
				.findElement(By.xpath("//*[@id='test-6-div']/div/table/tbody/tr[" + row + "]/td[" + column + "]"));
		String cellText = ele.getText();
		System.out.println(cellText);
		return cellText;

	}
}
