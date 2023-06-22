package com.chroma.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.chroma.pages.SEERHomePage;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MasterClassPartTwo {

    //SEERHomePage seerHomePage = new SEERHomePage();

    @Given("user is on the Request SEER Incidence Data home page")
    public void user_is_on_the_Request_SEER_Incidence_Data_home_page() {
        WebDriverUtils.driver.get("https://seerdataaccess-test.cancer.gov/seer-data-access");
    }

    @Then("About Non-Institutional Accounts text displays")
    public void about_Non_Institutional_Accounts_text_displays(String paragraph) {

        //String actualText = SEERHomePage.paragraphText.getText();

        String actualText = SEERHomePage.inspectLocator(SEERHomePage.paragraphTextTwo).getText();
      

        Assert.assertEquals(actualText, paragraph);
    }
}
