package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HealthCarBikeInsurance

{
	
	@When("I click on CarInsurance button")
	public void i_click_on_car_insurance_button()
	{
	   System.out.println("I click on CarInsurance button");
	}

	@When("I provide valid RTO Number and click on view quotes button")
	public void i_provide_valid_rto_number_and_click_on_view_quotes_button()
	{
	    System.out.println("I provide valid RTO Number and click on view quotes button");
	}

	@When("I provide valid details and click on view quotes button")
	public void i_provide_valid_details_and_click_on_view_quotes_button()
	{
	    System.out.println("I provide valid details and click on view quotes button");
	}

	@Then("I should get plan details")
	public void i_should_get_plan_details()
	{
	  System.out.println("I should get plan details");  
	}

	@When("I click on BikeInsurance button")
	public void i_click_on_bike_insurance_button()
	{
	    System.out.println("I click on BikeInsurance button");
	}
	
	@Given("I login to application")
	public void i_login_to_application()
	{
	    System.out.println("I login to application");
	}



}
