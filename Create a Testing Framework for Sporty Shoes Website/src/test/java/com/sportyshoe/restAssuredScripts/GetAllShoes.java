package com.sportyshoe.restAssuredScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

@Test (priority='1')
public class GetAllShoes {
	@Test(priority='1')
	
	public void get_all_shoes()
	{
		Response res = RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-shoes")
		.when().get();
		Assert.assertEquals(res.statusCode(), 200);
		res.then().log().all();
;
		
	}
	
	@Test(priority='2')
	public void get_all_users()
	{
		
		Response res = RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-users")
		.when().get();
		Assert.assertEquals(res.statusCode(), 200);
		res.then().log().all();
		
	}
	
}
