package com.modules;


import org.apache.sling.commons.json.JSONArray;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;
import org.junit.Assert;

import com.helpers.UrlBuilder;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class GetAction {

	static Response res;
	static String getData;
	
	

	public static void getRequest() {
		RestAssured.baseURI = UrlBuilder.getBasePathURI();
		res = RestAssured.get("/posts");
	}

	public static void getData() {
		getData = res.asString();
		// System.out.println(data);
	}

	public static void validateData() throws JSONException {

		JSONArray array = new JSONArray(getData);
		int jsonlength = array.length();
		
		Assert.assertTrue( jsonlength  < 5);
		
		for (int i = 0; i < array.length(); i++) {
			JSONObject jsonObj = array.getJSONObject(i);
			String id = jsonObj.getString("id");
			if(id.equals("67")) {
			Assert.assertEquals(id,"67");
			}
			String author = jsonObj.getString("author");
			if(author.equals("raji")) {
				Assert.assertEquals(author,"raji");
				}
			String title = jsonObj.getString("title");
			if(title.equals("Jenkins")) {
				Assert.assertEquals(title,"Jenkins");
				}
			}
		}

	

	public static void statusCode() {
		int code = res.getStatusCode();

		Assert.assertEquals(code, 200);
	}

	// **********************************Negative TestCases**********************************//

	public static void getNegRequest() {
		res = RestAssured.get("http://localhost:3000/posts/@");

	}

	public static void getInvalidResponse() {
		int code = res.getStatusCode();
		Assert.assertEquals(code, 404);
	}

}
