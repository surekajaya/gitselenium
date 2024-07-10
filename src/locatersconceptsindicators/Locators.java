package locatersconceptsindicators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Locators {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void idnameclassnamecssselecter() throws InterruptedException {
		
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#edit-name")).sendKeys("Sureka");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("12345");
		Thread.sleep(3000);
	//	driver.findElement(By.className("form-submit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input#edit-submit")).click();
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("Jayaprakash");
		driver.findElement(By.id("username")).sendKeys("Jayaprakash");
		
		driver.findElement(By.id("edit-name")).clear();
		
		
		
		
		
		
	}

}
