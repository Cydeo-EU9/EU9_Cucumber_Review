package cydeo.step_definitions;

import cydeo.pages.*;
import cydeo.utilities.*;
import io.cucumber.java.en.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;

public class VyTrackLoginStep {

    VyTrackLoginPage login = new VyTrackLoginPage();
    VyTrackDashPage dash = new VyTrackDashPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }

    @When("user enters driver credentials")
    public void user_enters_driver_credentials() throws IOException {
        String path = "new VyTrack credentials.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("vytrack");
        String username = sheet.getRow(0).getCell(0).toString();
        String password = sheet.getRow(0).getCell(1).toString();
        login.userNameInput.sendKeys(username);
        login.passwordInput.sendKeys(password);
        login.submitBtn.click();
    }

    @Then("user should see driver navigation options")
    public void user_should_see_driver_navigation_options() {

    }


    @When("user enters {string} information")
    public void user_enters_information(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should see manager navigation options")
    public void user_should_see_manager_navigation_options() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
