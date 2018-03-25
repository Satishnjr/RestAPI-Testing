package RestAssured_Java_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete {

	@Test
	public void testDelete() {

		RequestSpecification request = RestAssured.given();

		Response response = request.delete("http://localhost:3000/posts/24"); // delete id in json

		int code = response.getStatusCode();

		Assert.assertEquals(code, 200);

	}
}
