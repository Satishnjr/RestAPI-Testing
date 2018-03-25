package com.modules;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredDELETE_Action {

	static Response res;

	static RequestSpecification request;

	public static void deleteData() {
		request = RestAssured.given();

	}

	public static void deleteRequest() {
		res = request.delete("http://localhost:3000/posts/6");

	}

	public static void deleteStatusCode() {
		int code = res.getStatusCode();
		Assert.assertEquals(code, 200);

	}
	
//**********************************Negative Test Cases**********************************//

	public static void deleteNegRequest() {
		request = RestAssured.given();
		res = request.delete("http://localhost:3000/posts/32");
		
	}

	public static void delNegStatusCode() {
		int code = res.getStatusCode();
		Assert.assertEquals(code, 404);
		
	}

}
