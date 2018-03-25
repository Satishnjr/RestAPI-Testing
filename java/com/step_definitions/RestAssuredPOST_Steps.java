package com.step_definitions;

import com.modules.RestAssuredPOST_Action;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RestAssuredPOST_Steps {

	@Given("^User upload data to Json$")
	public void user_upload_data_to_Json() throws Throwable {

		RestAssuredPOST_Action.postData();

	}

	@When("^User send a POST request$")
	public void user_send_a_POST_request() throws Throwable {
		RestAssuredPOST_Action.postRequest();

	}

	@Then("^the server should handle it and return a success status$")
	public void the_server_should_handle_it_and_return_a_success_status() throws Throwable {

		RestAssuredPOST_Action.postStatusCode();

	}

}
