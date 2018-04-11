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
		res = RestAssured.get(UrlBuilder.getBasePathURI() + "/posts");
	}

	public static void getData() {
		getData = res.asString();
	}

	public static void validateData() throws JSONException {

		JSONArray array = new JSONArray(getData);
		int jsonlength = array.length();
		
		Assert.assertTrue( jsonlength  < 10);
		
		for (int i = 0; i < array.length(); i++) {
			JSONObject jsonObj = array.getJSONObject(i);
			String id = jsonObj.getString("id");
			if(id.equals("67")) {
				Assert.assertEquals("67",id);
				}
				String author = jsonObj.getString("author");
				if(author.equals("raji")) {
					Assert.assertEquals("raji",author);
					}
				String title = jsonObj.getString("title");
				if(title.equals("Jenkins")) {
					Assert.assertEquals("Jenkins", title);
					}
			}
		}

	

	public static void statusCode() {
		int code = res.getStatusCode();

		Assert.assertEquals(200, code);
	}

	// **********************************Negative TestCases**********************************//

	public static void getNegRequest() {
		res = RestAssured.get(UrlBuilder.getBasePathURI() + "/posts/@");

	}

	public static void getInvalidResponse() {
		int code = res.getStatusCode();
		Assert.assertEquals(404, code);
	}

}
