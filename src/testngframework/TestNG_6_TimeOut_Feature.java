package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_6_TimeOut_Feature {
	WebDriver driver;

	@Test
	public void bengalurusearch() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Bengaluru");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
		driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
		
	}
	
	@Test(timeOut=6000)
	public void seleniumsearch() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
		driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
	}
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
