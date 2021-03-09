//package test;
//
//import Driver.*;
//import POM.*;
//
//public class DemoTests extends BaseTest
//{
//
//	@BeforeEach
//	public void startBrowser() 
//	{
//		String url = "https://www.google.com";
//		CustomDriver.Initialize(BrowserType.Chrome);
//		CustomDriver.getDriver().get(url);
//	}
//
//	@Test
//	public void GoogleSearchKeywordTest() 
//	{
//		GoogleHomePage ghome = new GoogleHomePage();
//		ghome.ClickonAppsIcon();
//		ghome.Search("LinkedIn");
//	}
//
//	@AfterEach
//	public void tearDown() 
//	{
//		CustomDriver.getDriver().quit();
//	}
//}
