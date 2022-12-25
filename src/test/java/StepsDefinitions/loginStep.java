package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep {
	
	
	@Given("User want to open Url")
	public void user_want_to_open_url() {
     System.out.println("1. User open URL...");
	}

	@And("User wants open Login Page")
	public void user_wants_open_login_page() {
		System.out.println("2. User open Login Page...");
	}

	@When("User will Entry UserName and Password")
	public void user_will_entry_user_name_and_password() {
		System.out.println("3. User Enter UserName and Password in Login Page...");
	}

	@And("Click Login Button")
	public void click_login_button() {
		System.out.println("4. User Click  Login Button...");
	}

	@Then("User will find DashBoard Page")
	public void user_will_find_dash_board_page() {
		System.out.println("5. User will see DashBoard Page...");
	}

	@And("check the DashBoard Page Title")
	public void check_the_dash_board_page_title() {
		System.out.println("6. User will get DashBoard Page Title...");
	}

}
