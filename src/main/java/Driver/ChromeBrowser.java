package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser
{
	
	public static WebDriver DriverInstance= null;
	
	static
	{
		if(DriverInstance==null)
		{
	        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	        DriverInstance =new ChromeDriver();
	       
		}
	}

}
