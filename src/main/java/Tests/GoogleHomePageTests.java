package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Driver.ChromeBrowser;
import POM.*;

public class GoogleHomePageTests extends BaseTest
{

	@Before
	public void startBrowser() 
	{
		String url = "https://www.google.com";
		ChromeBrowser.GetInstance().get(url);
	}

	@Test
	public void GoogleSearch() 
	{
		GoogleHomePage ghome = new GoogleHomePage();
		ghome.ClickonAppsIcon();
		ghome.Search("Facebook");
	}

	@After
	public void tearDown() 
	{
		ChromeBrowser.GetInstance().quit();
	}
}
