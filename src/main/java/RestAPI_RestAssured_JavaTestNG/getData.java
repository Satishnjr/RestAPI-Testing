package RestAPI_RestAssured_JavaTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getData {

	@Test
	public void testResponseCode() {
		Response res = RestAssured.get("http://localhost:3000/posts");
		int code = res.getStatusCode();
		System.out.println("status code is:" + code);
		Assert.assertEquals(code, 200);
	}

	@Test
	public void testBody() {
		Response res = RestAssured.get("http://localhost:3000/posts");
		String data = res.asString();
		System.out.println(data);

		long time = res.getTime();
		System.out.println("Response Time is:" + time);

		String content = res.getContentType();
		System.out.println("Content Type is:" + content);
	}

}
