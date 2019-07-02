package Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample5 {
WebDriver driver;
		@Given("opens login page in newtours app")
		public void opens_login_page_in_newtours_app() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\anil.kumar.akula\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://newtours.demoaut.com");
		}

		@When("enter user name as mercury and password is mercury")
		public void enter_user_name_as_mercury_and_password_is_mercury() {
			pageobject.un.sendKeys("mercury");
			pageobject.psd.sendKeys("mercury");
			pageobject.ok.click();
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
