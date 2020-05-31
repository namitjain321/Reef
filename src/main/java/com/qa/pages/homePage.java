package com.qa.pages;

import com.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends TestBase {

    public homePage() {
        PageFactory.initElements(driver, this);
    }
    //Page Factory OR
    @FindBy(id = "mens")
    WebElement MenLink;

    //Methods Start here
    public menPLPPage clickMenLink() {
        MenLink.click();
        return new menPLPPage();
    }
}