package Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CustomDriver
{
	public static WebDriver _instance;
	
	public static void Initialize(BrowserType type)
	{
		if(type==BrowserType.Chrome)
		{
			_instance= getChromeDriver();
		}
		
	}
	
	public static WebDriver  getDriver()
	{
		return _instance;
	}
	
	private static WebDriver getChromeDriver()
	{
		if(_instance==null)
		{
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			
			_instance= new ChromeDriver();
		}
		
		return _instance;
		
	}

}
