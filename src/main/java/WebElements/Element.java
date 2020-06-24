package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Driver.ChromeBrowser;


public class Element
{
	By _by;
	ChromeDriver driver=ChromeBrowser.GetInstance();
	public Element(By by)
	{
		this._by=by;
	}
	
	public void Click()
	{
		driver.findElement(_by).click();
	}
	
	public void Clear()
	{
		driver.findElement(_by).clear();
	}
	
	public void SendKeys(String text)
	{
		driver.findElement(_by).sendKeys(text);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Submit()
	{
		driver.findElement(_by).submit();
	}

}
