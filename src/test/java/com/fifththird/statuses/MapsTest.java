package com.fifththird.statuses;
import static io.restassured.RestAssured.given;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class MapsTest {

	/***
	 * 	Given I have this information
		When I perform this action
		Then this should be the output
	 */
	@BeforeClass
	public void setup() {
		RestAssured.baseURI = "http://quality-assurance.bkmgejmchp.us-east-2.elasticbeanstalk.com";
		RestAssured.basePath = "/geoSearch";
	}
	
	@Test
	public void statusCodeVerification() {
		RestAssured.baseURI = "http://quality-assurance.bkmgejmchp.us-east-2.elasticbeanstalk.com";
		given()
			.param("lat", "39.1025363")
			.param("lon", "-84.510921")
		.when()
			.get("/geoSearch")
		.then()
			.statusCode(400);
	}
/*	
	@Test
	public void getResponseBody() {
		Response res =
		given()
			.param("lat", "39.1025363")
			.param("lon", "-84.510921")
		.when()
			.get("/distancematrix/json");
		
		System.out.println(res.body().prettyPrint());
	}
	
	*/

}
