package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Users\\suraj\\eclipse-workspace\\ATE-CapstoneProject\\src\\test\\java\\features\\sportyshoe.feature",
					 glue= {"steps"},
					 plugin= {"html:target/Cucumberreport2.html",
							 "pretty",
							"timeline:test-output-thread/"		
					}
				)

	public class TestRunner {

}
