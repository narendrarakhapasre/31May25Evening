package com.coverFox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxHealthPlanPage {
	
	//encapsulation in POM class
	//data members-->private
	//variables-->WebElement
	
	//variables
	
	@FindBy(className = "next-btn") private WebElement nextButton1;
	
	
	//constructor
	
	public CoverfoxHealthPlanPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
		//methods
	
	public void nextButton1()
	{
		nextButton1.click();
		System.out.println("click on next Button");
	}

}
