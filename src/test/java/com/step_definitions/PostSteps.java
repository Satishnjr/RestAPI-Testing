package com.step_definitions;

import com.modules.PostAction;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostSteps {

	@Given("^User upload data to Json$")
	public void user_upload_data_to_Json() throws Throwable {

		PostAction.postData();

	}

	@When("^User send a POST request$")
	public void user_send_a_POST_request() throws Throwable {
		PostAction.postRequest();

	}

	@And("^the server should handle it and return a success status$")
	public void the_server_should_handle_it_and_return_a_success_status() throws Throwable {

		PostAction.postStatusCode();

	}
	
	@Then("^User should check data has posted or not$")
	public void user_should_check_data_has_posted_or_not() throws Throwable {
		PostAction.validatePostData();
	}
	
	//**********************************Negative Test Cases**********************************//	
	
	@Given("^User upload duplicate data to Json$")
	public void user_upload_duplicate_data_to_Json() throws Throwable {
		PostAction.duplicateData();
	}

	@Then("^the server should return a invalid status code$")
	public void the_server_should_return_a_invalid_status_code() throws Throwable {
		PostAction.postNegStatusCode();
	}



}
