package dataDrivernFW;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

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

public class FBLOGIN {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void loginFB() throws Exception {

		FileInputStream fi = new FileInputStream(".\\testdata.xlsx");
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("fbLogin");
		Row row1 = s.getRow(2);
		Cell userName = row1.getCell(0);
		Cell password = row1.getCell(1);

		driver.findElement(By.name("email")).sendKeys(userName.getStringCellValue());
		driver.findElement(By.name("pass")).sendKeys(password.getStringCellValue());
		driver.findElement(By.name("login")).click();
	}

}
