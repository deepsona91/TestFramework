package WebElements;

import org.openqa.selenium.interactions.Actions;
import java.util.List;
import org.openqa.selenium.*;
import Driver.CustomDriver;


public class Element implements WebElement,Draggable
{
	protected By _by;
	private WebDriver driver=CustomDriver.getDriver();
	public Element(By by)
	{
		this._by=by;
	}
	
	@Override
	public <X> X getScreenshotAs(OutputType<X> target)
	{
		try
		{
			return driver.findElement(_by).getScreenshotAs(target);	
		}
		catch(Exception WebDriverException)
		{
			
		}
		return null;
		
	}

	@Override
	public void click() 
	{
		driver.findElement(_by).click();
		
	}

	@Override
	public void submit() 
	{
		driver.findElement(_by).submit();
		
	}

	@Override
	public void sendKeys(CharSequence... keysToSend) 
	{
		driver.findElement(_by).sendKeys(keysToSend);
		
	}

	@Override
	public void clear() 
	{
		driver.findElement(_by).clear();
		
	}

	@Override
	public String getTagName() 
	{
		return driver.findElement(_by).getTagName();
	}

	@Override
	public String getAttribute(String name) 
	{
		return driver.findElement(_by).getAttribute(name);
	}

	@Override
	public boolean isSelected() 
	{
		return driver.findElement(_by).isSelected();
	}

	@Override
	public boolean isEnabled() 
	{
		return driver.findElement(_by).isEnabled();
	}

	@Override
	public String getText() 
	{
		return driver.findElement(_by).getText();
	}

	@Override
	public List<WebElement> findElements(By by) 
	{
		return driver.findElement(_by).findElements(by);
	}

	@Override
	public WebElement findElement(By by)
	{
		return driver.findElement(_by).findElement(by);
	}

	@Override
	public boolean isDisplayed() 
	{
		return driver.findElement(_by).isDisplayed();
	}

	@Override
	public Point getLocation() 
	{
		return driver.findElement(_by).getLocation();
	}

	@Override
	public Dimension getSize() 
	{
		return driver.findElement(_by).getSize();
	}

	@Override
	public Rectangle getRect() 
	{
		return driver.findElement(_by).getRect();
	}

	@Override
	public String getCssValue(String propertyName) 
	{
		return driver.findElement(_by).getCssValue(propertyName);
	}
	
	public void DragToElement(Element e)
	{
		
		new Actions(driver).dragAndDrop(driver.findElement(_by), e).build().perform();
	}
	
	public void DragToOffset(int x, int y)
	{
		new Actions(driver).dragAndDropBy(driver.findElement(_by), x, y).build().perform();
		
	}

}
