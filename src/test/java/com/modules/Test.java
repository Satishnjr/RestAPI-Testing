package com.modules;

import org.junit.Assert;

import com.helpers.UrlBuilder;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test {

	public static void main(String[] args) {
		RequestSpecification request = RestAssured.given();
		//RestAssured.baseURI = UrlBuilder.getBasePathURI();
		System.out.println(UrlBuilder.getBasePathURI());
		System.out.println();
		Response res = request.delete(UrlBuilder.getBasePathURI()+ "/posts/7");
		int code = res.getStatusCode();
		Assert.assertEquals(200, code);
	}

}
