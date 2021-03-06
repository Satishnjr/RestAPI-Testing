package com.step_definitions;


import com.modules.GetAction;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetSteps {

	@Given("^User send a GET request$")
	public void user_send_a_GET_request() throws Throwable {

		GetAction.getRequest();

	}

	@When("^server processes the request$")
	public void server_processes_the_request() throws Throwable {
		GetAction.getData();
	}

	@And("^User should verify the correct statusCode$")
	public void user_should_verify_the_correct_statusCode() throws Throwable {
		
		GetAction.statusCode();
	}
	
	@Then("^User should vaidate data$")
	public void user_should_vaidate_data() throws Throwable {
		GetAction.validateData();
	}
	
//**********************************Negative Test Cases**********************************//
	

@Given("^User send a GET request with invalid url$")
public void user_send_a_GET_request_with_invalid_url() throws Throwable {
	GetAction.getNegRequest();
}

@Then("^User should not get any response from server$")
public void user_should_not_get_any_response_from_server() throws Throwable {
	GetAction.getInvalidResponse();
}


}
