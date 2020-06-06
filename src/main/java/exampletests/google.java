package exampletests;
import Driver.EnvironmentManager;
import Driver.RunEnvironment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class google 
{
	@Before
    public void startBrowser() {
        EnvironmentManager.initWebDriver();
    }

    @Test
    public void demo() {
    	
    	String url= "https://www.google.com";
        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get(url);
        
        driver.findElement(By.xpath("")).sendKeys("abcd");
       // String homeUrl = driver.findElement(By.cssSelector("div#logo> a#logo_image ")).getAttribute("href");
       // assertEquals(homeUrl, "https://www.blazemeter.com/");
    }

    @After
    public void tearDown() {
        EnvironmentManager.shutDownDriver();
    }

}
