package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import WebElements.Element;

public class GoogleHomePage 

{	
	Element googleApps= new Element(By.xpath("//a[@title=\"Google apps\"]"));
	Element searchButton= new Element(By.xpath("(//input[@value='Google Search'])[2]"));	
	Element searchBar=new Element(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
	
	public void Search(String searchtext)
	{
		searchBar.SendKeys(searchtext);
		searchBar.Submit();
	}
	
	public void ClickonAppsIcon()
	{
		googleApps.Click();
	}
}
