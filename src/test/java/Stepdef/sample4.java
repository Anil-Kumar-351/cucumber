package Stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample4 {

@Given("ACCENTURE WELCOMES YOU")
public void accenture_WELCOMES_YOU() {
System.out.println("ACCENTURE WELCOMES YOU");
}

@Given("user entered un and psd")
public void user_entered_un_and_psd() {
	System.out.println("Username and Password");
}

@Given("signin")
public void signin() {
	System.out.println("sign");
}

@When("user enters for product sports shoes")
public void user_enters_for_product_sports_shoes() {
	System.out.println("product");
}

@When("product added to the cart")
public void product_added_to_the_cart() {
	System.out.println("add to cart");
}

@When("user payed through netbanking")
public void user_payed_through_netbanking() {
	System.out.println("payment through net banking ");
}

@Then("signout")
public void signout() {
	System.out.println("signout");
}



}
