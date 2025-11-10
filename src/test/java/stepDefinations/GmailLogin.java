package stepDefinations;

import java.util.List;
import java.util.Map;

import org.testng.Reporter;

import io.cucumber.java.en.*;

public class GmailLogin 
{
	@Given("I am on login page")
	public void i_am_on_login_page() 
	{
	    Reporter.log("I am on login page", true);
	}

	@When("I provide details and click on login button")
	public void i_provide_details_and_click_on_login_button(io.cucumber.datatable.DataTable dataTable) 
	{
	   //reading table using list
		List<List<String>> testeListData = dataTable.asLists();
		List<String> user1 = testeListData.get(0);
		String userName1 = user1.get(0);//getting user1's userName
		String password1 = user1.get(1);//getting user1's password
		String msg1 = user1.get(2);//getting user1's msg
		Reporter.log(userName1, true);
		Reporter.log(password1, true);
		Reporter.log(msg1, true);
		
		//reading table using map
		List<Map<String, String>> testeMapData = dataTable.asMaps();
		System.out.println("====================================");
		System.out.println(testeMapData.get(1).get("userName"));
		System.out.println("====================================");

	}

	@Then("I should navigate to inbox")
	public void i_should_navigate_to_inbox() 
	{
	   Reporter.log("I should navigate to inbox", true);
	}


}
