package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.UnderConstructionModule;
import utility.TestContext;

public class UnderConstructionSteps {
    WebDriver driver;
    UnderConstructionModule underConstructionModule;

    public UnderConstructionSteps(TestContext context) {
        driver = context.getWebDriverManager().getDriver();
        underConstructionModule = context.getPageObjectManager().getUnderConstructionModule();
    }

    @Then("under construction page is displayed")
    public void under_construction_page_is_displayed() {
        Assert.assertTrue(underConstructionModule.isUnderConstructionImageDisplayed());
        Assert.assertTrue(underConstructionModule.isBackToHomeImageDisplayed());
    }

    @When("user clicks on back to home image")
    public void user_clicks_on_back_to_home_image() {
        underConstructionModule.clickBackToHomeImageLink();
    }
}
