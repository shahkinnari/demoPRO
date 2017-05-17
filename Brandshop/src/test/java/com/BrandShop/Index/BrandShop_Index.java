package com.BrandShop.Index;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Init.SeleniumInit;
import com.Init.Common;
import com.Init.ITestStatus;

public class BrandShop_Index extends SeleniumInit {
	
	int numOfFailure = 0;
	int logStep = 1;
	int log=0;
	int TC_ID=1;
	
	@Test
	public void StartUp() throws IOException
	{
		
		
		Common.logcase("Testcase Id: TC_1");
		
		Common.logcase("Testcase Name: Shopping Cart .");

		Common.logstep("Step " + (logStep++) + " : Open url is: <a>" + testUrl + "</a>");
		Common.pause(2);
		System.err.println("Hello");
		try {
			
			Brand_verification = Brand_Indexpage.PopUpBox();
		} catch (Exception e) {
			System.err.println("No Any Popup Generated");
		}
		Brand_verification = Brand_Indexpage.ClickMenu();
		Common.pause(1);
		Common.logstep("Step " + (logStep++) + " :Select Product");
		Brand_verification = Brand_Indexpage.AddtoCart();
		Brand_verification = Brand_Indexpage.Cart_Checkout_Click();
		Common.pause(1);
		
		Common.logcase("Fill up the Shipping Details.");

		Common.logstep("Step " + (logStep++) + " :Shpping Form for Personal Details.");
		// Login for Intellidox system
		Common.pause(2);
	
		Brand_verification = Brand_Indexpage.Shipping_form_emailID();
		Common.pause(1);
		Brand_verification = Brand_Indexpage.Shipping_form_FirstName();
		Brand_verification = Brand_Indexpage.Shipping_form_lastName();
		Brand_verification = Brand_Indexpage.Shipping_form_Company();
		Brand_verification = Brand_Indexpage.Shipping_form_Street1();
		Brand_verification = Brand_Indexpage.Shipping_form_Street2();
		Brand_verification = Brand_Indexpage.Shipping_form_City();
		Brand_verification = Brand_Indexpage.Shipping_form_State();
		Brand_verification = Brand_Indexpage.Shipping_form_Postcode();
		Brand_verification = Brand_Indexpage.Shipping_form_Country();
		Brand_verification = Brand_Indexpage.Shipping_form_Telephone();
		Brand_verification = Brand_Indexpage.Shipping_form_ShippingMethod();
		Brand_verification = Brand_Indexpage.Shipping_form_NextBtn();
		//Brand_verification = Brand_verification.Shipping_form_NextPageVerification();
		log("Verify User is redirect on Payment Page");
		if(Brand_verification.Shipping_form_NextPageVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		Common.logcase(" Fill up the Payment Details.");
		Common.logstep("Step " + (logStep++) + " :Shpping Form for Payment Details.");
		Brand_verification = Brand_Indexpage.Shipping_form_Payment_Method();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardType();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardNumber();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardExpireMonth();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardExpireYear();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardVerifCode();
		Brand_verification = Brand_Indexpage.Shipping_form_Payment_PlaceOrder();
		log("Verify User is getting Successfully Done 'Thank You' message.");
		if(Brand_verification.Shipping_form_NextPageSuccessVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
		Common.pause(2);
		
		
	}
	
	@Test
	public void FailedTC() throws IOException
	{
		
		
		Common.logcase("Testcase Id: TC_2");
		
		Common.logcase("Testcase Name: Shopping Cart with second Product.");

		Common.logstep("Step " + (logStep++) + " : Open url is: <a>" + testUrl + "</a>");
		Common.pause(2);
		System.err.println("Hello");
		try {
			
			Brand_verification = Brand_Indexpage.PopUpBox();
		} catch (Exception e) {
			System.err.println("No Any Popup Generated");
		}
		Brand_verification = Brand_Indexpage.ClickMenu();
		Common.pause(1);
		Common.logstep("Step " + (logStep++) + " :Select Product");
		Brand_verification = Brand_Indexpage.AddtoCartFailed();
		Brand_verification = Brand_Indexpage.Cart_Checkout_Click();
		Common.pause(1);
		
		Common.logcase("Fill up the Shipping Details.");

		Common.logstep("Step " + (logStep++) + " :Shpping Form for Personal Details.");
		// Login for Intellidox system
		Common.pause(2);
	
		Brand_verification = Brand_Indexpage.Shipping_form_emailID();
		Common.pause(1);
		Brand_verification = Brand_Indexpage.Shipping_form_FirstName();
		Brand_verification = Brand_Indexpage.Shipping_form_lastName();
		Brand_verification = Brand_Indexpage.Shipping_form_Company();
		Brand_verification = Brand_Indexpage.Shipping_form_Street1();
		Brand_verification = Brand_Indexpage.Shipping_form_Street2();
		Brand_verification = Brand_Indexpage.Shipping_form_City();
		Brand_verification = Brand_Indexpage.Shipping_form_State();
		Brand_verification = Brand_Indexpage.Shipping_form_Postcode();
		Brand_verification = Brand_Indexpage.Shipping_form_Country();
		Brand_verification = Brand_Indexpage.Shipping_form_Telephone();
		Brand_verification = Brand_Indexpage.Shipping_form_ShippingMethod();
		Brand_verification = Brand_Indexpage.Shipping_form_NextBtn();
		//Brand_verification = Brand_verification.Shipping_form_NextPageVerification();
		log("Verify User is redirect on Payment Page");
		if(Brand_verification.Shipping_form_NextPageVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		Common.logcase(" Fill up the Payment Details.");
		Common.logstep("Step " + (logStep++) + " :Shpping Form for Payment Details.");
		Brand_verification = Brand_Indexpage.Shipping_form_Payment_Method();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardType();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardNumber();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardExpireMonth();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardExpireYear();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardVerifCode();
		Brand_verification = Brand_Indexpage.Shipping_form_Payment_PlaceOrder();
		log("Verify User is getting Successfully Done 'Thank You' message.");
		if(Brand_verification.Shipping_form_NextPageSuccessVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
		Common.pause(2);
		
		
	}
	
	
/*	@Test*/

	/*public void Shipping_Form() throws IOException
	{
		
		
		//Common.logcase("Testcase Id: TC_2");
		Common.logcase("Fill up the Shipping Details.");

		Common.logstep("Step " + (logStep++) + " :Shpping Form for Personal Details.");
		// Login for Intellidox system
		Common.pause(2);
	
		Brand_verification = Brand_Indexpage.Shipping_form_emailID();
		Common.pause(1);
		Brand_verification = Brand_Indexpage.Shipping_form_FirstName();
		Brand_verification = Brand_Indexpage.Shipping_form_lastName();
		Brand_verification = Brand_Indexpage.Shipping_form_Company();
		Brand_verification = Brand_Indexpage.Shipping_form_Street1();
		Brand_verification = Brand_Indexpage.Shipping_form_Street2();
		Brand_verification = Brand_Indexpage.Shipping_form_City();
		Brand_verification = Brand_Indexpage.Shipping_form_State();
		Brand_verification = Brand_Indexpage.Shipping_form_Postcode();
		Brand_verification = Brand_Indexpage.Shipping_form_Country();
		Brand_verification = Brand_Indexpage.Shipping_form_Telephone();
		Brand_verification = Brand_Indexpage.Shipping_form_ShippingMethod();
		Brand_verification = Brand_Indexpage.Shipping_form_NextBtn();
		//Brand_verification = Brand_verification.Shipping_form_NextPageVerification();
		log("Verify User is redirect on Payment Page");
		if(Brand_verification.Shipping_form_NextPageVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
	}
	@Test
	public void Shipping_Payment_Detail() throws IOException
	{
		
		Common.logcase(" Fill up the Payment Details.");
		Common.logstep("Step " + (logStep++) + " :Shpping Form for Payment Details.");
		Brand_verification = Brand_Indexpage.Shipping_form_Payment_Method();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardType();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardNumber();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardExpireMonth();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardExpireYear();
		Brand_verification = Brand_Indexpage.Shipping_form_CreditCardVerifCode();
		Brand_verification = Brand_Indexpage.Shipping_form_Payment_PlaceOrder();
		log("Verify User is getting Successfully Done 'Thank You' message.");
		if(Brand_verification.Shipping_form_NextPageSuccessVerification())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		
		Common.pause(2);
	}
	*/
	
		//Brand_verification = Brand_Indexpage.Shipping_form_lastName();
		
	/*	if(AsbaVerification.verifyHomePage())
		{
			logStatus(ITestStatus.PASSED);
		}
		else
		{
			logStatus(ITestStatus.FAILED);
		}
		Common.logstep("Step " + (logStep++) + " : Click on ' Training Contract' link.");
		AsbaVerification = AsbaIndexPage.clickOnTrainingContract();
		Common.pause(5);
*/

}