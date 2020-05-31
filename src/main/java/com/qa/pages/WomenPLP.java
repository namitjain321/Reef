package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.base.TestBase.driver;

public class WomenPLP {

    public WomenPLP() {
        PageFactory.initElements(driver, this);
    }

    //Page Factory OR

    @FindBy(xpath = "")
    WebElement womenPageHeading;


//Methods start here

    public String validateWomenPLPTitle() {
        return driver.getTitle();
    }

    public String validateWomenHeading() {
        return womenPageHeading.getText();
    }

}