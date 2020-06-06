package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Driver.ChromeBrowser;
import POM.*;

public class GoogleHomePageTests

{

	@Before
	public void startBrowser() {
	}

	@Test
	public void GoogleSearch() {

		String url = "https://www.google.com";
		ChromeBrowser.DriverInstance.get(url);
		GoogleHomePage ghome = new GoogleHomePage();
		ghome.ClickonAppsIcon();
		ghome.Search("Facebook");

	}

	@After
	public void tearDown() {
		ChromeBrowser.DriverInstance.quit();
	}
}
