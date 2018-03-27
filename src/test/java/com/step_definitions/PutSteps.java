package com.step_definitions;

import com.modules.PutAction;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PutSteps {

	@Given("^User wants to modify data in Json$")
	public void user_wants_to_modify_data_in_Json() throws Throwable {

		PutAction.modifyData();

	}

	@When("^User send a PUT request$")
	public void user_send_a_PUT_request() throws Throwable {
		PutAction.putRequest();
	}

	@And("^the server should return a success status$")
	public void the_server_should_return_a_success_status() throws Throwable {
		PutAction.putStatusCode();

	}
	
	@Then("^User should check data has modified or not$")
	public void user_should_check_data_has_modified_or_not() throws Throwable {
		PutAction.validatePutData();
	}
	
	//**********************************Negative Test Cases**********************************//
	
	@When("^User send a PUT request by giving invalid id$")
	public void user_send_a_PUT_request_by_giving_invalid_id() throws Throwable {
		PutAction.putNegRequest();
	}

	@Then("^the server should return a invalid status$")
	public void the_server_should_return_a_invalid_status() throws Throwable {
		PutAction.putNegStatusCode();
	}

}
