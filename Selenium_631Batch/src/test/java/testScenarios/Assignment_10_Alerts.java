package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_10_Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		// Maximize window
		driver.manage().window().maximize();

		// wait
		Thread.sleep(3000);
		driver.get("https://demoqa.com/alerts");

		// wait
		Thread.sleep(3000);
		driver.findElement(By.id("alertButton")).click();

		// wait
		Thread.sleep(3000);
		// alert ok
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'timerAlertButton\']")).click();

       //wait for 5 seconds and then display alert message
		Thread.sleep(6000);
		String alertMessage2 = driver.switchTo().alert().getText();
		System.out.println(alertMessage2);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		//Scroll into webelement
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)", 
//				driver.findElement(By.xpath("//*[@id=\'confirmButton\']")));
		
		//or
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", 
//				driver.findElement(By.xpath("//*[@id=\'confirmButton\']")));
		
		// Confirm alert
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		String alertMessage3 = driver.switchTo().alert().getText();
		System.out.println(alertMessage3);
		//driver.switchTo().alert().accept();
		 driver.switchTo().alert().dismiss();
		
		//GEt the plain text from application
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		//Send data into an Alert
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='promtButton']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("test my data");
		driver.switchTo().alert().accept();
	}
}
