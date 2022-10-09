package cydeo.step_definitions;

import cydeo.pages.*;
import cydeo.utilities.*;
import io.cucumber.java.en.*;
import org.junit.*;

import java.util.*;

public class WebTabelLoginStepDefinition {

    TableLoginPage loginPage = new TableLoginPage();


    @Given("user go to web table login page")
    public void user_go_to_web_table_login_page() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }
    @When("user enter username and password")
    public void user_enter_username_and_password() {
        String username = ConfigurationReader.getProperty("web.table.username");
        String password = ConfigurationReader.getProperty("web.table.pw");
        loginPage.login(username,password);
    }
    @Then("URL should end with orders")
    public void url_should_end_with_orders() {
       String title = Driver.getDriver().getCurrentUrl();
       Assert.assertTrue(title.endsWith("orders"));
    }

    @When("user enter wrong username and password")
    public void user_enter_wrong_username_and_password() {
        String username = "abc";
        String password = "123";
        loginPage.login(username,password);

    }
    @Then("URL should not end with orders")
    public void url_should_not_end_with_orders() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
