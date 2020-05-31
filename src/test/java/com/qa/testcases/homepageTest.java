package com.qa.testcases;

import com.qa.base.TestBase;
import com.qa.pages.menPLPPage;
import com.qa.pages.homePage;
import org.testng.Assert;
import org.testng.annotations.*;


public class homepageTest extends TestBase {

    homePage homepageobject;
    menPLPPage plpObject;

    public homepageTest() {
        super();
    }

    @BeforeClass
    public void setup() {
        Initialization();
        homepageobject = new homePage();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    @Test
    public void clickMenLink() {
        plpObject = homepageobject.clickMenLink();
    }

//    @Test
    public void validateMenPLPBrowserTitle() {
        String browserTitle = plpObject.validateMenPLPBrowserTitle();
        Assert.assertEquals(browserTitle, "Comfortable Mens Shoes in the Latest Styles | Rockport");
    }

  //  @Test
    public void validateMenPLPHeading() {
        String menPLPHeading = plpObject.validateMenHeading();
        Assert.assertEquals(menPLPHeading, "All Men's Shoes");
    }
}