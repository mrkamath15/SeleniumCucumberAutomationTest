package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.FlightsPage;
import utility.TestContext;

public class FlightsPageSteps {
    FlightsPage flightsPage;
    WebDriver driver;

    public FlightsPageSteps(TestContext context) {
        flightsPage = context.getPageObjectManager().getFlightsPage();
        driver = context.getWebDriverManager().getDriver();
    }

    @When("user fills all oneway booking details")
    public void user_fills_all_oneway_booking_details() {
        flightsPage.clickOneWayTrip();
        flightsPage.selectPassengerCount("2");
        flightsPage.selectDepartingFromCity("Paris");
        flightsPage.selectDepartingOnMonth("January");
        flightsPage.selectDepartingOnDay("1");
        flightsPage.selectArrivingInCity("London");
        flightsPage.clickBusinessClass();
        flightsPage.selectAirline("Blue Skies Airlines");
    }

    @When("user fills all round trip booking details")
    public void user_fills_all_round_trip_booking_details() {
        flightsPage.clickOneWayTrip();
        flightsPage.selectPassengerCount("2");
        flightsPage.selectDepartingFromCity("Paris");
        flightsPage.selectDepartingOnMonth("January");
        flightsPage.selectDepartingOnDay("1");
        flightsPage.selectArrivingInCity("London");
        flightsPage.selectReturningOnMonth("November");
        flightsPage.selectReturningOnDay("15");
        flightsPage.clickBusinessClass();
        flightsPage.selectAirline("Blue Skies Airlines");
    }

    @When("user clicks on continue button")
    public void user_clicks_on_continue_button() {
        flightsPage.clickContinue();
    }

    @When("flights results page is displayed")
    public void flights_results_page_is_displayed() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/test/newtours/reservation2.php");
    }

}
