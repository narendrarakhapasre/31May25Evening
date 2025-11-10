package com.coverFox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxHomePage {
	
	//encapsulation in POM Class
	//data members/variables-->private
	//variables-->WebElement
	
	//variables
	
	@FindBy(xpath = "//button[text()='Get Started']") private WebElement GetStartedButton;
	
	//constructor
	
	public CoverfoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
		//methods
	
	public void clickOnGetStartedButton()
	{
		GetStartedButton.click();
		System.out.println("click on GetStartedButton");
	}

}
