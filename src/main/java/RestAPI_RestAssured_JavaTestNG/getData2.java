package RestAPI_RestAssured_JavaTestNG;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class getData2 {

	@Test
	public void testResponseCode() {
		int code = get("http://localhost:3000/posts").getStatusCode();   //import is changed to all, instead of RestAssured class-->import static io.restassured.RestAssured.*;
		System.out.println("status code is:" + code);
		Assert.assertEquals(code, 200);
	}

	@Test
	public void testBody() {
		String data = get("http://localhost:3000/posts").asString();
		System.out.println("status code is:" + data);

		long time = get("http://localhost:3000/posts").getTime();
		System.out.println("Response Time is:" + time);

		String content = get("http://localhost:3000/posts").getContentType();
		System.out.println("Content Type is:" + content);
	}

}
