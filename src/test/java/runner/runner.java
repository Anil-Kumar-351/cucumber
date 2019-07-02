package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class runner {

	@RunWith(Cucumber.class)
	@CucumberOptions(features={"src/main/resources/test6.feature"},
	glue={"runner","Stepdef"},
			 plugin="json:target/jsonreport.json")
	//plugin="html:target/htmlreport")
	//plugin="junit:target/xmlreport.xml")
	public class Runnerclass {

	}

}
