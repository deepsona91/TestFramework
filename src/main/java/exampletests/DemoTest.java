package exampletests;

import Driver.EnvironmentManager;
import Driver.RunEnvironment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class DemoTest {

    @Before
    public void startBrowser() {
        EnvironmentManager.initWebDriver();
    }

    @Test
    public void GoogleTest() 
    {
    	
    	String url= "https://stackoverflow.com/questions/10773979/junit-tests-not-running-in-eclipse";
        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get(url);
       // String homeUrl = driver.findElement(By.cssSelector("div#logo> a#logo_image ")).getAttribute("href");
       // assertEquals(homeUrl, "https://www.blazemeter.com/");
    }

    @After
    public void tearDown() 
    {
        EnvironmentManager.shutDownDriver();
    }
}
