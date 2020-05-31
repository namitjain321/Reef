package com.qa.pages;

import com.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.qa.base.TestBase.driver;

public class menPLPPage extends TestBase {

    public menPLPPage() {
        PageFactory.initElements(driver, this);
    }

    //Page Factory OR

    @FindBy(xpath = "//*[@id=\"primary\"]/h1")
    WebElement menPageHeading;

    //Methods start here

    public String validateMenPLPBrowserTitle() {
System.out.println("title is"+driver.getTitle());
        return driver.getTitle();
    }

    public String validateMenHeading() {
        System.out.println("Heading is"+menPageHeading.getText());
        return menPageHeading.getText();
    }
}
