package steps;

import static io.restassured.RestAssured.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class PostPutDeleteShoe {
	
Response res;
	
	@Given("User enters BaseURI and BasePath")
	public void user_enters_base_uri_and_base_path() {
		given().baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id", "1020")
		.queryParam("image", "www.imge.com")
		.queryParam("name", "Nike")
		.queryParam("category", "Running")
		.queryParam("sizes", "5,6,7")
		.queryParam("prices", "2000");
	}

	@When("User executes HTTP post method")
	public void user_executes_http_post_method() {
		res= given().baseUri("http://localhost:9010")
				.basePath("/add-shoe")
				.when().post();
	}

	@Then("Print all the details on the console")
	public void print_all_the_details_on_the_console() {
		res.then().log().all();
	}

	@Given("User enter BaseUri and Basepath")
	public void user_enter_base_uri_and_basepath() {
		given().baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id", "1020")
		.queryParam("image", "www.imge123.com")
		.queryParam("name", "Reebook")
		.queryParam("category", "Running")
		.queryParam("sizes", "5,6,7")
		.queryParam("prices", "2500");
	}

	@When("User executes HTTP put method")
	public void user_executes_http_put_method() {
		res= given().baseUri("http://localhost:9010")
				.basePath("/update-shoe")
				.when().put();
	}

	@Then("Prints all the details on the console")
	public void prints_all_the_details_on_the_console() {
		res.then().log().all();
	}

	@Given("User enter BaseUri Basepath")
	public void user_enter_base_uri_basepath() {
		given().baseUri("http://localhost:9010")
		.basePath("/delete-shoe")
		.queryParam("id", "1020");
	}

	@When("User executes HTTP delete method")
	public void user_executes_http_delete_method() {
		res= given().baseUri("http://localhost:9010")
				.basePath("/delete-shoe")
				.when().delete();
	}

	@Then("Prints all the detail on the console")
	public void prints_all_the_detail_on_the_console() {
		res.then().log().all();
	}

}

