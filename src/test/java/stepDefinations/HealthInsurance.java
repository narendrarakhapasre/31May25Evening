package stepDefinations;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.Reporter;

import com.coverFox.DriverConfig.DriverFactory;
import com.coverFox.Pages.CoverfoxAddressDetails1;
import com.coverFox.Pages.CoverfoxHealthPlanPage;
import com.coverFox.Pages.CoverfoxHomePage;
import com.coverFox.Pages.CoverfoxMemberDetails;
import com.coverFox.Pages.CoverfoxResultPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HealthInsurance 
{
	CoverfoxHomePage coverfoxHomePage=new CoverfoxHomePage(DriverFactory.getDriver());
	CoverfoxHealthPlanPage coverfoxHealthPlanPage=new CoverfoxHealthPlanPage(DriverFactory.getDriver());
	CoverfoxMemberDetails coverfoxMemberDetails=new CoverfoxMemberDetails(DriverFactory.getDriver());
	CoverfoxAddressDetails1 coverfoxAddressDetails1=new CoverfoxAddressDetails1(DriverFactory.getDriver());
	CoverfoxResultPage coverfoxResultPage=new CoverfoxResultPage(DriverFactory.getDriver());
	
	
	@Given("I am on home page")
	public void i_am_on_home_page()
	{
	    System.out.println("I am on home page");
	}

	@When("I click on getstarted button")
	public void i_click_on_getstarted_button() throws InterruptedException
	{
		Thread.sleep(4000);
	   System.out.println("I click on getstarted button");
	   coverfoxHomePage.clickOnGetStartedButton();
	}

	@When("I click on next button")
	public void i_click_on_next_button() throws InterruptedException 
	{
		Thread.sleep(4000);
	    System.out.println("I click on next button");
	    coverfoxHealthPlanPage.nextButton1();
	}

	@When("I provide age as {string} , click on next button")
	public void i_provide_age_as_click_on_next_button(String age) throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(4000);
	    System.out.println("I provide age as "+age+",click on next button");
	    coverfoxMemberDetails.ageDropDown(age);
	    coverfoxMemberDetails.nextButton2();
	}

	@When("I provide pincode as {string}, mobNum as {string} and click on continue button")
	public void i_provide_pincode_as_mob_num_as_and_click_on_continue_button(String pincode, String mobNum) throws InterruptedException 
	{
		Thread.sleep(4000);
	   System.out.println("I provide pincode as "+pincode+",mobNum as "+mobNum+"and click on continue button");
	   coverfoxAddressDetails1.enterPinCode(pincode);
	   coverfoxAddressDetails1.enterMobileNum(mobNum);
	   coverfoxAddressDetails1.continueButton();
	  Assert.fail();
	}

	@Then("matching health insurance plans should be displayed as {string}")
	public void matching_health_insurance_plans_should_be_displayed_as(String results) throws InterruptedException
	{ 
		Thread.sleep(6000);
	    System.out.println("matching health insurance plans should be displayed as "+results);
	    String actualResults = coverfoxResultPage.getMatchingResultNumbers();
	    Reporter.log("actual result is "+actualResults, true);
	}
	@When("I click on continue button")
	public void i_click_on_continue_button() throws InterruptedException
	{
		Thread.sleep(3000);
		coverfoxAddressDetails1.continueButton();
		
	}

	@Then("Validate error messages")
	public void validate_error_messages() throws InterruptedException
	{
		Thread.sleep(2000);
	     String pinErrMsg = coverfoxAddressDetails1.getPincodeErrMsg();
		  String mobErrMsg= coverfoxAddressDetails1.getMobNumErrMsg();		
			Reporter.log("Pinocode error message is: "+pinErrMsg, true);
			Reporter.log("Mobile number error message is"+mobErrMsg, true);
			Reporter.log("changes by narendra", true);

	}



}
