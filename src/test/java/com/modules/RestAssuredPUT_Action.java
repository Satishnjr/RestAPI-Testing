package com.modules;

import org.json.simple.JSONObject;
import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPUT_Action {

	static Response res;

	static RequestSpecification request;

	public static void modifyData() {
		request = RestAssured.given();

		request.header("Content-Type", "application/json");

		JSONObject json = new JSONObject();
		json.put("id", "20");
		json.put("title", "Devops");
		json.put("author", "chandu123");
		request.body(json.toJSONString());
	}

	public static void putRequest() {
		res = request.put("http://localhost:3000/posts/67");

	}

	public static void putStatusCode() {
		int code = res.getStatusCode();
		Assert.assertEquals(code, 200);

	}

//**********************************Negative Test Cases**********************************//
	public static void putNegRequest() {
		res = request.put("http://localhost:3000/posts/50");
		
	}

	public static void putNegStatusCode() {
		int code = res.getStatusCode();
		Assert.assertEquals(code, 404);
		
	}

}
