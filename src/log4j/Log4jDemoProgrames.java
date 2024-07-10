package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Log4jDemoProgrames {
	WebDriver driver;
	
	
  @Test
  public void googlesearch() {
	  
	  Logger log = Logger.getLogger("Search");
	  PropertyConfigurator.configure("Log4j.properties");
	 
	  driver = new ChromeDriver();
	  
	log.info("Chrome Browser Launched");
	
	 driver.manage().window().maximize();
	
	 log.info("Browser Window Maximized");
	 
	 driver.get("https://www.google.com");
	 
	 log.info("Google Webside Launched");
	 
	 driver.get("https://seleniumlearn.com/log4j-tutorial");
	 
	 log.info("Seleniumlearn page launched");
	 
  }
}
