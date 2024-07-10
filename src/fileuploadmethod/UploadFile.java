package fileuploadmethod;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class UploadFile {
	
	WebDriver driver;
	
	
  @Test
  public void Attachfiles() throws InterruptedException {
	  
	  Thread.sleep(4000);
	  driver.get("http://baalabharathi.com/upload-story/");
	  Thread.sleep(4000);
	  
	  driver.findElement(By.xpath("//textarea[@id='field-SUtF8PwfCXGXx46']")).sendKeys("My Offer Letters");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@id='field-8lqEle2zeOhMu0a']")).sendKeys("C:\\Users\\Lenovo\\Documents\\Lib\\Java Keywords.PNG");
	  
	  //driver.findElement(By.xpath("//input[@id='field-8lqEle2zeOhMu0a']")).sendKeys("C:\\Users\\Lenovo\\Documents\\Lib\\My Programms.rtf");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	 
  }

}
