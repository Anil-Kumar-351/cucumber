package Stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class sample1 {

@Given("opens login page in newtours app")
public void opens_login_page_in_newtours_app() {
	System.out.println("opens login page in newtoyrs app");
}

@When("enter user name as mercury and password is mercury")
public void enter_user_name_as_mercury_and_password_is_mercury() {
	System.out.println("entered user name and password");
}

@When("Click submit button")
public void click_submit_button() {
	System.out.println("clicked on submit button");   
}

@Then("Verify login result")
public void verify_login_result() {
   System.out.println("login esults verified");
}


}
