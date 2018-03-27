package com.modules;

import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;
import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutAction {

	static Response res;

	static RequestSpecification request;

	public static void modifyData() throws JSONException {
		request = RestAssured.given();

		request.header("Content-Type", "application/json");

		JSONObject json = new JSONObject();
		json.put("id", "67");
		json.put("title", "Devops");
		json.put("author", "chandu123");
		request.body(json.toString());
	}

	public static void putRequest() {
		res = request.put("http://localhost:3000/posts/67");

	}

	public static void putStatusCode() {
		int code = res.getStatusCode();
		Assert.assertEquals(code, 200);

	}
	public static void validatePutData() throws JSONException {
		String getData = res.asString();
		JSONObject obj = new JSONObject (getData);
	Object title = obj.get("title");
	Assert.assertEquals(title, "Devops");
		
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
