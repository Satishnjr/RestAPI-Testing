package RestAPI_RestAssured_JavaTestNG;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post {

	@Test
	public void testPost() {

		RequestSpecification request = RestAssured.given();

		request.header("Content-Type", "application/json"); // Headers

		JSONObject json = new JSONObject();
		json.put("id", "29"); // Body
		json.put("title", "selenium");
		json.put("author", "chandu");

		request.body(json.toJSONString()); //converting json to string
		Response response = request.post("http://localhost:3000/posts"); //url

		int code = response.getStatusCode(); //response code

		System.out.println("Response Code:" + code);
		Assert.assertEquals(code, 201);

	}
}
