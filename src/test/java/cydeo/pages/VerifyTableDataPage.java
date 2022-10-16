package cydeo.pages;

import cydeo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class VerifyTableDataPage {

    public VerifyTableDataPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    @FindBy(xpath = "//td[.=\"Alexandra Gray\"]")
//    public WebElement name1;
//
//    @FindBy(xpath = "//td[.=\"Thin Crust\"]")
//    public WebElement type1;

    public WebElement returnPizzaType(String name){

         return Driver.getDriver().findElement(By.xpath("//td[.=\"" + name + "\"]/following-sibling::td[1]"));

    }

    public WebElement returnAmount(String name){
        return Driver.getDriver().findElement(By.xpath("//td[.=\"" + name + "\"]/following-sibling::td[2]"));
    }

    public WebElement returnState(String name){
        return Driver.getDriver().findElement(By.xpath("//td[.=\"" + name + "\"]/following-sibling::td[6]"));
    }

    public WebElement returnCardNo(String name){
        return Driver.getDriver().findElement(By.xpath("//td[.=\"" + name + "\"]/following-sibling::td[9]"));
    }


}
