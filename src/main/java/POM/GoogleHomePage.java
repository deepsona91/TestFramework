package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import WebElements.Element;

public class GoogleHomePage extends BasePom

{	
	Element googleApps= new Element(By.xpath("//a[@aria-label='Google apps']"));
	Element searchButton= new Element(By.xpath("(//input[@value='Google Search'])[2]"));	
	Element searchBar=new Element(By.xpath("//input[@aria-label='Search']"));
	
	public void Search(String searchtext)
	{
		searchBar.sendKeys(searchtext);
		searchBar.submit();
	}
	
	public void ClickonAppsIcon()
	{
		googleApps.click();
	}
}
