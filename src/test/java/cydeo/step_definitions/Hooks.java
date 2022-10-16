package cydeo.step_definitions;

import cydeo.utilities.*;
import io.cucumber.java.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.*;
import org.openqa.selenium.*;

public class Hooks {


    @Before(value = "@wip")
    public void runFirst(){
        System.out.println("I will run before wip scenario");
    }
//
    @Before(value = "@smoke")
    public void runAgain(){
        System.out.println("I will run before smoke scenario");
    }

    @After
    public void teardownScenario(Scenario scenario){

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value


        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


        //BrowserUtils.sleep(5);
        Driver.closeDriver();

        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/ Take screenshot if failed!");
    }


}
