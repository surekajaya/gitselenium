package surekatestngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_0_S {
	WebDriver driver;
	
  @Test(enabled = false) 
  public void facebook() {
	  driver.get("https://www.google.com");
	  
  }
  
  @Test(enabled = true)
  public void googlemethod1() {
	  driver.get("https://www.redmine.org");
  }
  
  @Test(dependsOnMethods="googlemethod1")
  public void redminemethod2() {
	  driver.findElement(By.className("login")).click();
	  driver.findElement(By.id("username")).sendKeys("SurekaAllimuthu");
	  driver.findElement(By.cssSelector(".lost_password")).sendKeys("sureka21a@gmail.com");
	
	  
	  	  
	  
  }
  
  @Test
  public void f() {
  }
  
  @BeforeTest
  public void beforeTest() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }
  	
  
}
