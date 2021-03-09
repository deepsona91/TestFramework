package test;

import org.testng.*;
import org.testng.annotations.*;
import Driver.*;
import POM.*;

public class TestNgDemo 
{

  @BeforeTest
  public void beforeTest() 
  {
		String url = "https://www.google.com";
		CustomDriver.Initialize(BrowserType.Chrome);
		CustomDriver.getDriver().get(url);	  
  }
  
  @Test
  public void CanSearchkeyWordOnGoogleTest() 
  {
		GoogleHomePage ghome = new GoogleHomePage();
		ghome.ClickonAppsIcon();
		ghome.Search("LinkedIn");
		Assert.assertTrue(CustomDriver.getDriver().getCurrentUrl().toLowerCase().contains("google"));
  }

  @AfterTest
  public void afterTest() 
  {
	  CustomDriver.getDriver().quit();	  
  }

}
