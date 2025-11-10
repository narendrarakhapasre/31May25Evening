package com.coverFox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxAddressDetails1 {
	
	//variables
	
	@FindBy(className = "mp-input-text") private WebElement pinCodefield;
	@FindBy(id = "want-expert") private WebElement mobileNumfield;
	@FindBy(className = "next-btn") private WebElement continueButton;
	
	//constructor
	
	public CoverfoxAddressDetails1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void enterPinCode(String pincode)
	{
		pinCodefield.sendKeys(pincode);
		System.out.println("entering pincode....value is "+pincode);
	}
	
	public void enterMobileNum(String mobilenum)
	{
		mobileNumfield.sendKeys(mobilenum);
		System.out.println("entering mobile number....value is "+mobilenum);
	}
	
	public void continueButton()
	{
		continueButton.click();
		System.out.println("clicking on continue button");
	}

}
