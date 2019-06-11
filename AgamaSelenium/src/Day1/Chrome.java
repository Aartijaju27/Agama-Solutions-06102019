package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	


		// to invoke chrome browser 1. 
		
		ChromeDriver driver;
		
		public void inVokeBrowser()
		{
			// backword slash \t \t \n are escape seq or seq, char so it will give error use forward slash or double backword slash
			
			//2. set system property
			
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			 
			driver=new ChromeDriver();
			
			//  use double slash for path
			
			driver.manage().window().maximize();
			
			
			driver.manage().deleteAllCookies();
			// delete all will bypass cookies and will not delete it.
			// it will just bypass 
			
			driver.get("http://qatechhub.com");
			
			// invoking chrome browser maximizing window and deleting cookies.
			
			
		}
		
		public void getTitleOfthePage()
		{
			System.out.println("Title of the page is: "+driver.getTitle());
			
		}
		
		public void navigateCommands()
		{
			driver.navigate().to("http:\\facebook.com");   // same as get command. driver.get
			
			driver.navigate().back();
			
			driver.navigate().forward();
			
			driver.navigate().refresh();
			
			
			
		}
		
		
		public void closeBrowser()
		{
			// 2 methods to close.
			
		//	driver.close();
			
		
			
			// driver.close - it only closes current active window.
			
			//driver.quit();
			// quit() will close all window opened by selenium.
			
			
		}
	}



