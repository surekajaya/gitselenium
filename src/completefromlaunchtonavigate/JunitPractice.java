package completefromlaunchtonavigate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitPractice {
	
	static WebDriver driver;
	
		@BeforeAll
	static void setUpBeforeClass() throws Exception {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void test1() {
		
		driver.get("http://www.google.com");
		
		driver.navigate().to("http://www.facebook.com");
		
		driver.navigate().back();
			
	}

	@Test
	void test2() {
		driver.get("http://www.youtube.com");
	}

	
	@Test
	void test3() {
		driver.get("https://www.selenium.dev/");
	}

	
	@Test
	void test4() {
		driver.get("https://seleniumlearn.com/");
		
	}

		
}
