package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;



public class DesktopAutomation {
	
	Screen s = new Screen();
	
	  @Test
  public void desktop() throws FindFailed, InterruptedException {
		  
		  s.click("C:\\Users\\Lenovo\\Documents\\Sikuli\\Tools.png");
		  
		  s.click("C:\\Users\\Lenovo\\Documents\\Sikuli\\Start.png");
		  
		  Thread.sleep(3000);
		  
		 s.click("C:\\Users\\Lenovo\\Documents\\Sikuli\\Chat.png");
		 
		Thread.sleep(3000); 
		
	
		  
		  
  }
}
