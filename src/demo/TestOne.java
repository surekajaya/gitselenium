package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestOne {
	WebDriver driver;
  @Test
  public void google() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Bengaluru"+Keys.ENTER);	 
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
