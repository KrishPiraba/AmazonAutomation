package com.amazon.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TelevisionPage {
	Actions action;
	WebDriver driver;
	public TelevisionPage(WebDriver driver)
	{
		this.driver = driver;
		 action= new Actions(driver);
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//div[@id='s-refinements']//span[text()='Brands']")
	WebElement Brand;
	@FindBy(xpath="//*[@id=\"s-refinements\"]/div[21]/ul/li[4]/span/a/span")
	WebElement Samsung;
	@FindBy(xpath="//span[@Class='a-dropdown-label']")
	WebElement Dropdown;
	@FindBy(xpath="//div[@class='a-popover-inner']//ul[1]//li[3]")
	WebElement Sortbyitem;
	@FindBy(xpath="//img[@data-image-index]")
	List<WebElement> Items;
	@FindBy(xpath="//span[@class='a-price-whole']")
	List<WebElement> Price;
	
	
	public void Tvclick() throws InterruptedException
	{
		
		
		action .scrollToElement(Brand);
		action.moveToElement(Samsung).click().build().perform();

		Dropdown.click();
	
		Sortbyitem.click();
		
		
	}	
	
		
		
		
		public List<WebElement> Pricelist()
		{
			int len=Price.size();
			System.out.println(Price.toString());
			if(len!=0)
			{
				Price.get(1).click();
				System.out.println(Price.get(1).getText());
			}
			return Price;
		
	}
	
	
	

}
