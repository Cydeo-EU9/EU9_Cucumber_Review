package cydeo.step_definitions;

import cydeo.pages.*;
import cydeo.utilities.*;
import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.*;

public class ValidateTableDataStepDef {

    String name = "";
    VerifyTableDataPage verifyTableDataPage = new VerifyTableDataPage();

    @Given("User is on web table page")
    public void user_is_on_web_table_page() {
        Driver.getDriver().get("https://practice.cydeo.com/web-tables");
    }

    @When("Name is {string}")
    public void name_is(String string) {
        name = string;
    }
    @Then("The pizza type should be {string}")
    public void the_pizza_type_should_be(String string) {
        String type = verifyTableDataPage.returnPizzaType(name).getText();
        Assert.assertEquals(string,type);
    }
    @Then("Amount should be {string}")
    public void amount_should_be(String string) {
        String amount = verifyTableDataPage.returnAmount(name).getText();
        Assert.assertEquals(string,amount);
    }
    @Then("State should be {string}")
    public void state_should_be(String string) {
        String state = verifyTableDataPage.returnState(name).getText();
        Assert.assertEquals(string,state);
    }
    @Then("Card number should be {string}")
    public void card_number_should_be(String string) {
        String cardNo = verifyTableDataPage.returnCardNo(name).getText();
        Assert.assertEquals(string,cardNo);

    }
}
