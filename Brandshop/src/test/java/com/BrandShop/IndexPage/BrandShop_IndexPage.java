package com.BrandShop.IndexPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Init.AbstractPage;
import com.Init.Common;
import com.BrandShop.Verification.BrandShop_Verification;

public class BrandShop_IndexPage extends AbstractPage {

	public BrandShop_IndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@FindBy(xpath="//div[@class='modal-inner-wrap']//header//button")
	public WebElement PopUP;
	public BrandShop_Verification PopUpBox() throws IOException {
		Common.pause(3);
		//Common.findAndSwitchToSecondWindow(driver, )
		System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
		Common.pause(1);
		Common.clickOn(driver, PopUP);  
		log("Clicked on <b>" + "popup dialog box "+" </b> for close it.");
		
	
		return new BrandShop_Verification(driver);
	}
	
	@FindBy(xpath="//span[contains(.,'Men')]/..")
	public WebElement Menu_Men;
	public BrandShop_Verification ClickMenu() throws IOException {
		Common.pause(3);
		//Common.findAndSwitchToSecondWindow(driver, )
		System.out.println("Windows Size is: "+ driver.getWindowHandles().size());
		System.out.println("WELCOME");
		Common.pause(3);
		Common.clickOn(driver, Menu_Men);  
		log("Clicked on <b>" + "Men Link "+" </b> From Menu bar.");
		
	
		return new BrandShop_Verification(driver);
	}
	
	@FindBy(xpath="(//button[@title='Add to Cart'])[1]")
	public WebElement Menu_men_Addtocart;
	
	@FindBy(xpath="(//button[@title='Add to Cart'])[2]")
	public WebElement Menu_men_Addtocart_Failed;
	
	@FindBy(xpath="(//a[@class='product-item-link'])[1]")
	public WebElement Menu_men_ProductName;
	public BrandShop_Verification AddtoCart() throws IOException {
		Common.pause(3);
		Common.highlightElement(driver, Menu_men_ProductName);
		Common.pause(3);
		log("Select Product as: <b>" + Menu_men_ProductName.getText()+" </b> From list of Product.");
		Common.pause(1);
		Common.clickOn(driver, Menu_men_Addtocart);  
		log("Click on <b>"+"Add to Cart "+"</b> button.");
		return new BrandShop_Verification(driver);
	}
	
	
	public BrandShop_Verification AddtoCartFailed() throws IOException {
		Common.pause(3);
		Common.highlightElement(driver, Menu_men_Addtocart_Failed);
		Common.pause(3);
		log("Select Product as: <b>" + Menu_men_ProductName.getText()+" </b> From list of Product.");
		Common.pause(1);
		Common.clickOn(driver, Menu_men_Addtocart_Failed);  
		log("Click on <b>"+"Add to Cart "+"</b> button.");
		return new BrandShop_Verification(driver);
	}
	
			@FindBy(xpath="(//div[@class='modal-content'])[2]//button[contains(text(),'CHECKOUT')]")
			public WebElement Cart_checkOut;
			public BrandShop_Verification Cart_Checkout_Click() throws IOException {
				Common.pause(1);
				Common.highlightElement(driver,Cart_checkOut);
				Common.pause(1);
				Common.clickOn(driver, Cart_checkOut);  
				log("Click on <b>"+"CheckOut"+"</b> button.");
				Common.pause(3);
				return new BrandShop_Verification(driver);
			}
			
			
			@FindBy(xpath="//input[@id='customer-email']")
			public WebElement Customer_Email;
			public BrandShop_Verification Shipping_form_emailID() throws IOException {
				Common.pause(1);
				Common.highlightElement(driver,Customer_Email);
				Common.pause(1);
				Customer_Email.sendKeys("kinnari@mailinator.com"); 
				Common.pause(1);
				log("Enter Customer Email Id as: <b>"+Customer_Email.getAttribute("value")+"</b>.");
				Common.pause(3);
				return new BrandShop_Verification(driver);
			}
			
			public BrandShop_Verification SendsKEY(WebElement ID, String value) throws IOException {
				Common.pause(1);
				Common.highlightElement(driver,ID);
				ID.sendKeys(value); 
				Common.pause(1);
				log("Entered value is: <b>"+ID.getAttribute("value")+"</b>.");
				Common.pause(1);
				return new BrandShop_Verification(driver);
			}
			
			
			@FindBy(xpath="//input[@name='firstname']")
			public WebElement Customer_FName;
			public BrandShop_Verification Shipping_form_FirstName() throws IOException {
				log("Enter First Name");
				SendsKEY(Customer_FName,"Kinnari");
				Common.pause(1);
				return new BrandShop_Verification(driver);
			}
			
			
			@FindBy(xpath="//input[@name='lastname']")
			public WebElement Customer_LName;
			public BrandShop_Verification Shipping_form_lastName() throws IOException {
				log("Enter Last Name");
				SendsKEY(Customer_LName,"Shah");
				Common.pause(1);
				return new BrandShop_Verification(driver);
			}
			
			
			@FindBy(xpath="//input[@name='company']")
			public WebElement Customer_Company;
			public BrandShop_Verification Shipping_form_Company() throws IOException {
				log("Enter Company Name");
				SendsKEY(Customer_Company,"kiwiqa");
				Common.pause(1);
				return new BrandShop_Verification(driver);
			}
			
			@FindBy(xpath="//input[@name='street[0]']")
			public WebElement Customer_Street1;
			public BrandShop_Verification Shipping_form_Street1() throws IOException {
				log("Enter Street Name");
				SendsKEY(Customer_Street1,"10 Marsh");
				Common.pause(1);
				return new BrandShop_Verification(driver);
			}
			
			
			@FindBy(xpath="//input[@name='street[1]']")
			public WebElement Customer_Street2;
			public BrandShop_Verification Shipping_form_Street2() throws IOException {
				log("Enter Second Street Name");
				SendsKEY(Customer_Street2,"adam Hall");
				Common.pause(1);
				return new BrandShop_Verification(driver);
			}
			
			@FindBy(xpath="//input[@name='city']")
			public WebElement Customer_City;
			public BrandShop_Verification Shipping_form_City() throws IOException {
				log("Enter City Name");
				SendsKEY(Customer_City,"East Lansing");
				Common.pause(1);
				return new BrandShop_Verification(driver);
			}
			
			
			@FindBy(xpath="//select[@name='region_id']")
			public WebElement Customer_State;
			public BrandShop_Verification Shipping_form_State() throws IOException {
				log("Select State Name");
				Common.selectFromComboByVisibleText(Customer_State, "Michigan");
				Common.pause(1);
				log("Seected State as: <b> "+Common.SelectedTextOption+"</b>.");
				return new BrandShop_Verification(driver);
			}
			
			@FindBy(xpath="//input[@name='postcode']")
			public WebElement Customer_PostCode;
			public BrandShop_Verification Shipping_form_Postcode() throws IOException {
				log("Enter PostCode");
				SendsKEY(Customer_PostCode,"48824-0000");
				Common.pause(1);
				return new BrandShop_Verification(driver);
			}
			
			
			@FindBy(xpath="//select[@name='country_id']")
			public WebElement Customer_CountryID;
			public BrandShop_Verification Shipping_form_Country() throws IOException {
				log("Select Country Name");
				Common.selectFromComboByVisibleText(Customer_CountryID, "United States");
				Common.pause(1);
				log("Seected Country as: <b> "+Common.SelectedTextOption+"</b>.");
				return new BrandShop_Verification(driver);
			}
			
			@FindBy(xpath="//input[@name='telephone']")
			public WebElement Customer_telephone;
			public BrandShop_Verification Shipping_form_Telephone() throws IOException {
				log("Enter Phone Number");
				SendsKEY(Customer_telephone,"122345789");
				Common.pause(1);
				return new BrandShop_Verification(driver);
			}
			
			@FindBy(xpath="(//input[@name='shipping_method'])[1]")
			public WebElement ShippingMethod_1;
			public BrandShop_Verification Shipping_form_ShippingMethod() throws IOException {
				log("Select Shippping Method");
				Common.clickOn(driver, ShippingMethod_1);
				Common.pause(1);
				return new BrandShop_Verification(driver);
			}
			
					
			@FindBy(xpath="//span[contains(text(),'Next')]/../..")
			public WebElement Btn_Next;
			
			
			public BrandShop_Verification Shipping_form_NextBtn() throws IOException {
				log("Clicked on Next Button");
				Common.clickOn(driver, Btn_Next);
				Common.pause(5);
				return new BrandShop_Verification(driver);
			}	
			
			
			@FindBy(xpath=".//*[@id='md_cybersource']")
			public WebElement Paymentmethod_CreditCard;
			
			
			public BrandShop_Verification Shipping_form_Payment_Method() throws IOException {
				log("Clicked on Credit Card");
				Common.clickOn(driver, Paymentmethod_CreditCard);
				Common.pause(5);
				return new BrandShop_Verification(driver);
			}	
			
			@FindBy(xpath=".//*[@id='md_cybersource_cc_type']")
			public WebElement Paymentmethod_CreditCardType;
			
			
			public BrandShop_Verification Shipping_form_CreditCardType() throws IOException {
				log("Select Credit Card Type");
				Common.selectFromComboByVisibleText(Paymentmethod_CreditCardType, "Visa");
				Common.pause(1);
				log("Select Credit card as: <b> "+Common.SelectedTextOption+"</b>.");
				return new BrandShop_Verification(driver);
			}	
			
			
			
			
			
			@FindBy(xpath=".//*[@id='md_cybersource_cc_number']")
			public WebElement CreditCardNumber;
			public BrandShop_Verification Shipping_form_CreditCardNumber() throws IOException {
				log("Enter Credit card Number");
				SendsKEY(CreditCardNumber,"4444333322221111");
				Common.pause(1);
				return new BrandShop_Verification(driver);
			}
			
			@FindBy(xpath=".//*[@id='md_cybersource_expiration']")
			public WebElement CreditCardExpireMonth;
			public BrandShop_Verification Shipping_form_CreditCardExpireMonth() throws IOException {
				log("Select Credit Card Expire Month");
				Common.selectFromComboByVisibleText(CreditCardExpireMonth, "03 - March");
				Common.pause(1);
				log("Select Credit card Expire Month as: <b> "+Common.SelectedTextOption+"</b>.");
				return new BrandShop_Verification(driver);
			}	
			
			@FindBy(xpath=".//*[@id='md_cybersource_expiration_yr']")
			public WebElement CreditCardExpireYear;
			public BrandShop_Verification Shipping_form_CreditCardExpireYear() throws IOException {
				log("Select Credit Card Expire Year");
				Common.selectFromComboByVisibleText(CreditCardExpireYear, "2020");
				Common.pause(1);
				log("Select Credit card Expire Year as: <b> "+Common.SelectedTextOption+"</b>.");
				return new BrandShop_Verification(driver);
			}	
			
			@FindBy(xpath=".//*[@id='md_cybersource_cc_cid']")
			public WebElement CreditCardVerificationCode;
			public BrandShop_Verification Shipping_form_CreditCardVerifCode() throws IOException {
				log("Enter Credit card Verification code");
				SendsKEY(CreditCardVerificationCode,"123");
				Common.pause(1);
				return new BrandShop_Verification(driver);
			}
			
			@FindBy(xpath="//button[@title='Place Order']")
			public WebElement Paymentmethod_PlaceOrder;
			
			
			public BrandShop_Verification Shipping_form_Payment_PlaceOrder() throws IOException {
				log("Clicked on Place Order button");
				Common.clickOn(driver, Paymentmethod_PlaceOrder);
				Common.pause(5);
				return new BrandShop_Verification(driver);
			}	
}
