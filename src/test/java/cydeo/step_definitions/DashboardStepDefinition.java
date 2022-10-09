package cydeo.step_definitions;

import cydeo.pages.*;
import cydeo.utilities.*;
import io.cucumber.java.en.*;
import org.junit.*;

import java.util.*;

public class DashboardStepDefinition {

    @Given("user is loged in")
    public void user_is_loged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        TableLoginPage loginPage = new TableLoginPage();
        String username = ConfigurationReader.getProperty("web.table.username");
        String password = ConfigurationReader.getProperty("web.table.pw");
        loginPage.login(username,password);
    }
    @Then("user should see below contents")
    public void user_should_see_below_contents(List<String> contents) {
        DashboardPage dbPage = new DashboardPage();
        List<String> actual = new ArrayList<>();
        actual.add(dbPage.pageLabel.getText());
        actual.add(dbPage.allOrderBtn.getText());
        actual.add(dbPage.allProBtn.getText());
        actual.add(dbPage.orderBtn.getText());
        actual.add(dbPage.logoutBtn.getText());
        actual.add(dbPage.selectBtn.getText());
        actual.add(dbPage.deselctBtn.getText());

        Assert.assertEquals(contents,actual);
    }
}
