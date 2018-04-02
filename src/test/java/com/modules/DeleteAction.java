package com.modules;

import org.junit.Assert;

import com.helpers.UrlBuilder;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteAction {

	static Response res;

	static RequestSpecification request;

	public static void deleteData() {
		request = RestAssured.given();

	}

	public static void deleteRequest() {
		res = request.delete(UrlBuilder.getBasePathURI()+"/posts/10");

	}

	public static void deleteStatusCode() {
		int code = res.getStatusCode();
		Assert.assertEquals(200, code);

	}
	
//**********************************Negative Test Cases**********************************//

	public static void deleteNegRequest() {
		request = RestAssured.given();
		res = request.delete(UrlBuilder.getBasePathURI() + "/posts");
		
	}

	public static void delNegStatusCode() {
		int code = res.getStatusCode();
		Assert.assertEquals(404, code);
		
	}

}
