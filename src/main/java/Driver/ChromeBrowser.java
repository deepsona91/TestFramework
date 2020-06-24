package Driver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser
{
	private static ChromeDriver _instance=null;
	
	
	private ChromeBrowser()
	{
		
	}
	
	public static ChromeDriver GetInstance()
	{
		if(_instance==null)
		{
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			_instance= new ChromeDriver();
		}
		
		return _instance;
			
	}

}
