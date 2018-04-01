package com.modules;

import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;
import org.junit.Assert;

import com.helpers.UrlBuilder;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostAction {

	static Response res;

	static RequestSpecification request;

	public static void postData() throws JSONException {
		request = RestAssured.given();

		request.header("Content-Type", "application/json");

		JSONObject json = new JSONObject();
		json.put("id", "478");
		json.put("title", "Jenkins");
		json.put("author", "raji");
		request.body(json.toString());
	}

	public static void postRequest() {
		RestAssured.baseURI = UrlBuilder.getBasePathURI().toString();
		res = request.post("/posts");

	}

	public static void postStatusCode() {
		int code = res.getStatusCode();
		Assert.assertEquals(code, 201);

	}
	
	public static void validatePostData() throws JSONException {
		String getData = res.asString();
		JSONObject obj = new JSONObject (getData);
	Object key = obj.get("id");
	Assert.assertEquals(key, "26");
	}
	
	
//**********************************Negative Test Cases**********************************//

	public static void duplicateData() throws JSONException {
		request = RestAssured.given();

		request.header("Content-Type", "application/json");

		JSONObject json = new JSONObject();
		json.put("id", "60");
		json.put("title", "Jenkins");
		json.put("author", "Satish");
		request.body(json.toString());
		
	}

	public static void postNegStatusCode() {
		int code = res.getStatusCode();
		Assert.assertEquals(code, 500);
	}

	

}
