package locatersconceptsindicators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class NewLocatersworking2 {

	static WebDriver driver;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Disabled
	@Test
	void test1() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("SurekaAllimuthu");
		driver.findElement(By.name("pass")).sendKeys("123");
		
	}

	@Disabled
	@Test
	void test2() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		/*driver.findElement(By.id("edit-name")).sendKeys("SurekaAllimuthu");
		driver.findElement(By.name("pass")).sendKeys("123");*/
		
		driver.findElement(By.cssSelector("input#edit-name")).sendKeys("Allimuthu");
		driver.findElement(By.name("pass")).sendKeys("123");
		
		driver.findElement(By.cssSelector(".form-submit")).click();
		
				
	}
	
	@Disabled
	@Test
	void test3() throws InterruptedException {
		driver.get("https://www.redmine.org/login");
		Thread.sleep(3000);	
		driver.findElement(By.id("username")).sendKeys("Dhivagar");
		driver.findElement(By.name("password")).sendKeys("123");
		
		driver.findElement(By.cssSelector("#login-submit")).click();
		
				
	}
	
	

		
}
