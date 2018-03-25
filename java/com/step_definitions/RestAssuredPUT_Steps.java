package com.step_definitions;

import com.modules.RestAssuredPUT_Action;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RestAssuredPUT_Steps {

	@Given("^User wants to modify data in Json$")
	public void user_wants_to_modify_data_in_Json() throws Throwable {

		RestAssuredPUT_Action.modifyData();

	}

	@When("^User send a PUT request$")
	public void user_send_a_PUT_request() throws Throwable {
		RestAssuredPUT_Action.putRequest();
	}

	@Then("^the server should return a success status$")
	public void the_server_should_return_a_success_status() throws Throwable {
		RestAssuredPUT_Action.putStatusCode();

	}
}
