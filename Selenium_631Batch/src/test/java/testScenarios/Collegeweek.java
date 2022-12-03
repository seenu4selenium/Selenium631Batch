package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Collegeweek {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("Ujjaval");
		driver.findElement(By.id("lastName")).sendKeys("Patel");
		driver.findElement(By.id("emailAddress")).sendKeys("er.uvypatel@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("7653432198");
		driver.findElement(By.name("password")).sendKeys("ujjaval123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("ujjaval123");
		Thread.sleep(5000);
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("INDIA");
		new Select(driver.findElement(By.name("attendeeType")))
				.selectByVisibleText("Student Looking for Graduate Degree");
		new Select(driver.findElement(By.id("questions[q_134]"))).selectByVisibleText("Fall 2022");
		new Select(driver.findElement(By.id("questions_16_Month"))).selectByVisibleText("October");
		new Select(driver.findElement(By.id("questions_16_DayOfMonth"))).selectByVisibleText("15");
		new Select(driver.findElement(By.id("questions_16_DOBYear"))).selectByVisibleText("1992");
		Thread.sleep(2000);
		//TO Open on Majors of Interest multiselect element
		driver.findElement(By.className("multiselect")).click();
		Thread.sleep(2000);
		//Choose any options checkbox for MultiSelect
		driver.findElement(By.xpath("//*[@id=\"questions[q_19][13]\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"questions[q_19][0]\"]")).click();

		
		Thread.sleep(2000);
		//TO Close on Majors of Interest multiselect element
		driver.findElement(By.className("multiselect")).click();

		Thread.sleep(5000);
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
		//driver.findElement(By.id("submit")).click();
	}
}
