package com.amazon.pageobjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BrandsPage {
	Actions action;
	WebDriver driver;
	public BrandsPage(WebDriver rdriver)
	{
		 this.driver=rdriver;
		 action= new Actions(driver);
		PageFactory.initElements(rdriver, this);
	
	}
	@FindBy(xpath="//div[@id=\"feature-bullets\"]//hr")
	WebElement AbtItem;
	@FindBy(xpath="//div[@id=\"feature-bullets\"]//li")
	List<WebElement> ItemDetails;
	
	
	
	public void windowDetails() 
	{
		
		String Parent=driver.getWindowHandle();
		Set<String>child_window=driver.getWindowHandles();
		System.out.println(Parent);
		Iterator<String> I1=child_window.iterator();
		while(I1.hasNext())
		{

		String child_window1=I1.next();


		if(!Parent.equals(child_window1))
		{
		driver.switchTo().window(child_window1);

		System.out.println(driver.switchTo().window(child_window1).getTitle());
		}
		}
	}
		
		
		
public void DisplayItemsDetails() 
	
	{
	
		action.scrollToElement(AbtItem);
		
		String AboutItem=AbtItem.getText();
		Assert.assertTrue(true, AboutItem);
		for(WebElement Item : ItemDetails)
		{
			Item.getText();
			System.out.println(Item.getText());
		}
		
	}

}
