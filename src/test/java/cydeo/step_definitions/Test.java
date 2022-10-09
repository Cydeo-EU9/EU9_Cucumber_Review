package cydeo.step_definitions;

import io.cucumber.java.en.*;

public class Test {

    @Given("User go to test page")
    public void user_go_to_test_page() {
        System.out.println("I am on the login page");
    }
    @When("user enter correct credentials")
    public void user_enter_correct_credentials() {
        System.out.println("I have entered username and password");
    }
    @Then("user should be able to see Dashboard")
    public void user_should_be_able_to_see_dashboard() {
        System.out.println("I am on the dashboard as expected");
    }

}
