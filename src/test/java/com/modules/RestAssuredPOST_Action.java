package com.modules;

import org.json.simple.JSONObject;
import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPOST_Action {

	static Response res;

	static RequestSpecification request;

	public static void postData() {
		request = RestAssured.given();

		request.header("Content-Type", "application/json");

		JSONObject json = new JSONObject();
		json.put("id", "6");
		json.put("title", "JenkinsPipeline");
		json.put("author", "raji");
		request.body(json.toJSONString());
	}

	public static void postRequest() {
		res = request.post("http://localhost:3000/posts");

	}

	public static void postStatusCode() {
		int code = res.getStatusCode();
		Assert.assertEquals(code, 201);

	}
	
	
//**********************************Negative Test Cases**********************************//

	public static void duplicateData() {
		request = RestAssured.given();

		request.header("Content-Type", "application/json");

		JSONObject json = new JSONObject();
		json.put("id", "60");
		json.put("title", "Jenkins");
		json.put("author", "Satish");
		request.body(json.toJSONString());
		
	}

	public static void postNegStatusCode() {
		int code = res.getStatusCode();
		Assert.assertEquals(code, 500);
	}

}
