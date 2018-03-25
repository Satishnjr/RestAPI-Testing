package com.step_definitions;

import com.modules.RestAssuredDELETE_Action;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RestAssuredDELETE_Steps {

	@Given("^User wants to delete data in Json$")
	public void user_wants_to_delete_data_in_Json() throws Throwable {
		RestAssuredDELETE_Action.deleteData();

	}

	@When("^User send a DELETE request$")
	public void user_send_a_DELETE_request() throws Throwable {
		RestAssuredDELETE_Action.deleteRequest();

	}

	@Then("^the server should remove api and return a success status$")
	public void the_server_should_remove_api_and_return_a_success_status() throws Throwable {
		RestAssuredDELETE_Action.deleteStatusCode();

	}

	//**********************************Negative Test Cases**********************************//
	
	@Given("^User send a DELETE request by giving invalid id$")
	public void user_send_a_DELETE_request_by_giving_invalid_id() throws Throwable {
		RestAssuredDELETE_Action.deleteNegRequest();
	}
	
	@Then("^the server should return a invalid code$")
	public void the_server_should_return_a_invalid_code() throws Throwable {
		RestAssuredDELETE_Action.delNegStatusCode();
	}


}
