package locatersconceptsindicators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Indicatersfrom5th {
	static WebDriver driver;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Disabled
	@Test
	void linktestpartiallinktest() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Health")).click();
		
	}

	
	@Test
	void tagnametotallinks() throws InterruptedException {
		driver.get("http://www.ndtv.com");
		Thread.sleep(3000);
		
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		System.out.println(totallinks.size());
		System.out.println("Total number of links on NDTV ="+totallinks.size());
		
		
	}

}

