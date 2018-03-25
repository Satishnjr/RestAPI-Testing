package RestAPI_RestAssured_JavaTestNG;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {

	@Test
	public void testPut() {

		RequestSpecification request = RestAssured.given();

		request.header("Content-Type", "application/json"); // Headers

		JSONObject json = new JSONObject();
		json.put("id", "16"); // Body
		json.put("title", "python");
		json.put("author", "raji");

		request.body(json.toJSONString());
		Response response = request.put("http://localhost:3000/posts/29"); //updating json

		int code = response.getStatusCode();

		System.out.println("Response Code:" + code);
		Assert.assertEquals(code, 200);

	}
}
