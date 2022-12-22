package dataDrivernFW;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class FBLOGIN_RetestingWithResults {
	WebDriver driver;
	String results;

	@BeforeClass
	public void beforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	}

	@Test
	public void loginFB() throws Exception {

		FileInputStream fi = new FileInputStream(".\\testdata.xlsx");
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("fbLogin");

		for (int i = 1; i <= s.getLastRowNum(); i++) {
			Row row = s.getRow(i);
			Cell userName = row.getCell(0);
			Cell password = row.getCell(1);

			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(userName.getStringCellValue());
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.name("pass")).sendKeys(password.getStringCellValue());
			driver.findElement(By.name("login")).click();
			Thread.sleep(5000);
			// Validate the results			
			if (driver.findElements(By.linkText("Find your account and log in.")).size() > 0
					||
				driver.findElements(By.linkText("Create a new Facebook account.")).size() > 0) {
				System.out.println("Given credentials are in-valid");
				results = "Fail";
			} else {
				System.out.println("Given credentials are valid");
				results = "Pass";
				//Prepare the logout script and call the fb login page url
			}

			Cell res = row.createCell(2);
			// abc is to find the 0th row colum 2
			res.setCellValue(results);
		}
		// push results from RAM location to excel sheet
		FileOutputStream fo = new FileOutputStream(".\\testdata.xlsx");
		w.write(fo);
		w.close();
	}

}
