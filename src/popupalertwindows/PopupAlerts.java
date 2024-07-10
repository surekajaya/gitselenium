package popupalertwindows;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PopupAlerts {
	WebDriver driver;
	
	@Test
	public void alertokbutton() throws InterruptedException {
		driver.get("https://seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
	
	
	@Test
	public void alertcancelbutton() throws InterruptedException {
		driver.get("https://seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
	}
	
	@Test
	public void alertsendtextokbutton() throws InterruptedException {
		driver.get("https://seleniumlearn.com/prompt-dialog-box");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("Jayaprakash");
		a.accept();
		
	//	driver.switchTo().alert().sendKeys("Dhanu");
	//	driver.switchTo().alert().accept();
		
	}
	
	
	@Test
	public void selenium() throws InterruptedException {
		driver.get("https://seleniumlearn.com/");
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	//	driver.quit();
	}

}
