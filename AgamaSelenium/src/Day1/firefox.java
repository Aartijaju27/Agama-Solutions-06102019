package Day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	FirefoxDriver driver;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
				
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://qatechhub.com");
	}
	public void getTitleOfthePage()
	{
		System.out.println("Title of the page: "+driver.getTitle());
		
	}
	
	public void closeBrowser()
	{
				
		driver.quit();	
		
		
	}
}



