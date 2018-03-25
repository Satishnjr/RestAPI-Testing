package com.step_definitions;

import org.junit.Assert;

import com.modules.RestAssuredDELETE_Action;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

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

}
