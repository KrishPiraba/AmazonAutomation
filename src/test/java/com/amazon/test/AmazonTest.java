package com.amazon.test;

import org.testng.annotations.Test;

import com.amazon.pageobjects.AmazonHomePage;
import com.amazon.pageobjects.BrandsPage;
import com.amazon.pageobjects.TelevisionPage;

import BaseClass.BaseClass;

public class AmazonTest extends BaseClass {
	@Test
	public void TestCase() throws InterruptedException{
	System.out.println(driver);
	AmazonHomePage homepage=new AmazonHomePage(driver);
	TelevisionPage televisionpage=new TelevisionPage(driver);
	BrandsPage brandpage = new BrandsPage(driver);
	homepage.pclick();
	televisionpage.Tvclick();
	televisionpage.Pricelist();
	brandpage.windowDetails();
	brandpage.DisplayItemsDetails();
	}

}

