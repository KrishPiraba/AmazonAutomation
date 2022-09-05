package com.amazon.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AmazonHomePage    {
	Actions action;
	WebDriver driver;
	public AmazonHomePage(WebDriver rdriver)
	{
		driver=rdriver;
		 action= new Actions(driver);
		PageFactory.initElements(rdriver, this);
	
	}
	
	@FindBy(id="nav-hamburger-menu")
	WebElement HamBurgerMenu;
	@FindBy(xpath="//div[@id='hmenu-content']//a[@data-menu-id='9']")
	WebElement TvElectronics;
	@FindBy(xpath="//ul[@data-menu-id='9']//a[text()='Televisions']")
	WebElement TV;
	
	
	public void pclick() 
	{
		action.moveToElement(HamBurgerMenu).click().build().perform();
		action.scrollToElement(TvElectronics);
		action.moveToElement(TvElectronics).click().build().perform();
		TV.click();
		
		
		
	}	
	
	
}
