package com.BrandShop.Verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Init.AbstractPage;
import com.Init.Common;

public class BrandShop_Verification extends AbstractPage {

	public BrandShop_Verification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath=".//*[@id='validate_address']/div[1]")
	public WebElement Next_page;
	
	
	public boolean Shipping_form_NextPageVerification()
	{
		if(Common.isElementDisplayed(Next_page))
			return true;
		else
			return false;
	}

	
	@FindBy(xpath="//span[contains(text(),'Thank you for your purchase!')]")
	public WebElement Next_page_Success;
	
	
	public boolean Shipping_form_NextPageSuccessVerification()
	{
		if(Common.isElementDisplayed(Next_page_Success))
			return true;
		else
			return false;
	}
}
