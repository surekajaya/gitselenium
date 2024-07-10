package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_4_Discription_Feature {
	WebDriver driver;

	@Test(description="Verify top menus list")
	public void RM1() {
		driver.findElement(By.xpath("//a[@class='home']")).click();
	}
	
	@Test(description="Verify the Registration")
	public void RM2() {
		driver.findElement(By.xpath("//a[@class='register']")).click();
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("surekha");
	}
	
	@Test(description="Verify Sign in Module")
	public void RM3_Search() {
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jayapraksh");
	}
	
	@Test(description="Search Module")
	public void RM4() {
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys("Java");
	}
	
	@Test(description="Header Menu Bar list")
	public void RM5() {
	driver.findElement(By.xpath("//a[@class='overview']")).click();
	}
	
	@Test(description="Verify Logo")
	public void RM6() {
		driver.findElement(By.xpath("//span[@class='current-project']")).click();
	}
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redmine.org");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
