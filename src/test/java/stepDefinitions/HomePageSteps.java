package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.HomePage;
import utility.TestContext;

public class HomePageSteps {
    HomePage homePage;
    WebDriver driver;

    public HomePageSteps(TestContext context) {
        homePage = context.getPageObjectManager().getHomePage();
        driver = context.getWebDriverManager().getDriver();
    }

    @Given("user is in home page")
    public void user_is_in_home_page() {
        driver.get(FileReaderManager.getInstance().getConfigFileReader().getApplicationUrl());
    }

    @When("user clicks on support link")
    public void user_clicks_on_support_link() {
        homePage.clickSupportLink();
        dismissIfAdsDisplayed();
    }

    @When("user clicks on contact link")
    public void user_clicks_on_contact_link() {
        homePage.clickContactLink();
        dismissIfAdsDisplayed();
    }

    @When("user clicks on hotels link")
    public void user_clicks_on_hotels_link() {
        homePage.clickHotelsLink();
        dismissIfAdsDisplayed();
    }

    @When("user clicks on car rentals link")
    public void user_clicks_on_car_rentals_link() {
        homePage.clickCarRentalsLink();
        dismissIfAdsDisplayed();
    }

    @When("user clicks on destinations link")
    public void user_clicks_on_destinations_link() {
        homePage.clickDestinationsLink();
        dismissIfAdsDisplayed();
    }

    @When("user clicks on vacations link")
    public void user_clicks_on_vacations_link() {
        homePage.clickVacationsLink();
        dismissIfAdsDisplayed();
    }

    @Then("home page is displayed")
    public void home_page_is_displayed() {
        Assert.assertEquals(driver.getCurrentUrl(), FileReaderManager.getInstance().getConfigFileReader().getApplicationUrl());
    }

    /*
    Temporary code to override the advertisement
     */
    public void dismissIfAdsDisplayed() {
        if (driver.getCurrentUrl().equalsIgnoreCase("https://demo.guru99.com/test/newtours/index.php#google_vignette")) {
            driver.navigate().to("https://demo.guru99.com/test/newtours/support.php");
        }
    }

}
