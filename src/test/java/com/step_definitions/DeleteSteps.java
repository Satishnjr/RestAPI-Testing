package com.step_definitions;

import com.modules.DeleteAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteSteps {

	@Given("^User wants to delete data in Json$")
	public void user_wants_to_delete_data_in_Json() throws Throwable {
		DeleteAction.deleteData();

	}

	@When("^User send a DELETE request$")
	public void user_send_a_DELETE_request() throws Throwable {
		DeleteAction.deleteRequest();

	}

	@Then("^the server should remove api and return a success status$")
	public void the_server_should_remove_api_and_return_a_success_status() throws Throwable {
		DeleteAction.deleteStatusCode();

	}

	//**********************************Negative Test Cases**********************************//
	
	@Given("^User send a DELETE request by giving base url$")
	public void user_send_a_DELETE_request_by_giving_base_url() throws Throwable {
		DeleteAction.deleteNegRequest();
	}
	
	@Then("^the server should return a invalid code$")
	public void the_server_should_return_a_invalid_code() throws Throwable {
		DeleteAction.delNegStatusCode();
	}


}
