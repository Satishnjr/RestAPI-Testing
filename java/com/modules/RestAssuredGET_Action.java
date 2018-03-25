package com.modules;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredGET_Action {

	static Response res;

	public static void getRequest() {
		res = RestAssured.get("http://localhost:3000/posts");
	}

	public static void getData() {
		String data = res.asString();
		System.out.println(data);
	}

	public static void statusCode() {
		int code = res.getStatusCode();

		Assert.assertEquals(code, 200);
	}

}
