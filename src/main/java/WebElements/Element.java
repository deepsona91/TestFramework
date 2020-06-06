package WebElements;

import org.openqa.selenium.By;

import Driver.ChromeBrowser;


public class Element
{
	By _by;
	public Element(By by)
	{
		this._by=by;
	}
	
	public void Click()
	{
		ChromeBrowser.DriverInstance.findElement(_by).click();
	}
	
	public void Clear()
	{
		ChromeBrowser.DriverInstance.findElement(_by).clear();
	}
	
	public void SendKeys(String text)
	{
		ChromeBrowser.DriverInstance.findElement(_by).sendKeys(text);
	}
	
	public void Submit()
	{
		ChromeBrowser.DriverInstance.findElement(_by).submit();
	}

}
