package com.coverFox.Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.coverFox.Utils.Utility;



public class CoverfoxMemberDetails {
	
	//variables
	@FindBy(id = "Age-You") private WebElement ageDropDown;
	@FindBy(className = "next-btn") private WebElement nextButton2;
	
	//constructor
	
	public CoverfoxMemberDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void ageDropDown(String age) throws EncryptedDocumentException, IOException
	{
		Utility.handleDropDownUsingVisibleText(ageDropDown," "+ age +" years ");
	}
	
	public void nextButton2()
	{
		nextButton2.click();
		System.out.println("click on next button");
	}

}
