package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetAllShoesandUsers {
	
Response res;
	
	@Given("User enters the BaseUri and BasePath")
	public void user_enters_the_base_uri_and_base_path() {
	             given().baseUri("http://localhost:9010")
				.basePath("/get-shoes");
	}

	@When("User executes HTTP get method")
	public void user_executes_http_get_method() {
	    res= given().baseUri("http://localhost:9010")
				.basePath("/get-shoes")
				.when().get();
	}

	@Then("Validate the response status code and print all the details on the console")
      public void validate_the_response_status_code_and_print_all_the_details_on_the_console() {
		Assert.assertEquals(res.statusCode(), 200);
		res.then().log().all();
	}

	@Given("User enter the BaseURI and BasePath")
	public void user_enter_the_base_uri_and_base_path() {
		given().baseUri("http://localhost:9010")
		.basePath("/get-users");
	}

	@When("User execute HTTP get Method")
	public void user_execute_http_get_method() {
		 res= given().baseUri("http://localhost:9010")
					.basePath("/get-users")
					.when().get();
	}

	@Then("Validates the Response status code and print all the details on the console")
	public void validates_the_response_status_code_and_print_all_the_details_on_the_console() {
		Assert.assertEquals(res.statusCode(), 200);
		res.then().log().all();
	}
}

