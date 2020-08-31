package com.modules;

import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;
import org.junit.Assert;

import com.helpers.UrlBuilder;

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
		json.put("id", "30");
		json.put("title", "dev");
		json.put("author", "chandu");
		request.body(json.toString());
	}

	public static void putRequest() {
		res = request.put(UrlBuilder.getBasePathURI() + "/posts/30");

	}

	public static void putStatusCode() {
		int code = res.getStatusCode();
		Assert.assertEquals(200, code);

	}
	public static void validatePutData() throws JSONException {
		String getData = res.asString();
		JSONObject obj = new JSONObject (getData);
	Object title = obj.get("title");
	Assert.assertEquals("dev",title);
		
	}
//**********************************Negative Test Cases**********************************//
	public static void putNegRequest() {
		res = request.put(UrlBuilder.getBasePathURI() + "/posts/33");
		
	}

	public static void putNegStatusCode() {
		int code = res.getStatusCode();
		Assert.assertEquals(404, code);
		
	}

	

}
