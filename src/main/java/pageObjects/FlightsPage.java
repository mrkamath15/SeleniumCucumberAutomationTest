package pageObjects;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightsPage {

    @FindBy(css = "input[value='roundtrip']")
    private WebElement roundTrip_radioButton;

    @FindBy(css = "input[value='oneway']")
    private WebElement oneway_radioButton;

    @FindBy(xpath = "//select[@name='passCount']")
    private WebElement passengerCount_dropDown;

    @FindBy(css = "select[name='fromPort']")
    private WebElement departingFromCity_dropDown;

    @FindBy(xpath = "//select[@name='fromMonth']")
    private WebElement departingOnMonth_dropDown;

    @FindBy(xpath = "//select[@name='fromDay']")
    private WebElement departingOnDay_dropDown;

    @FindBy(xpath = "//select[@name='toPort']")
    private WebElement arrivingIn_dropDown;

    @FindBy(css = "select[name='toMonth']")
    private WebElement returningOnMonth_dropDown;

    @FindBy(css = "select[name='toDay']")
    private WebElement returningOnDay_dropDown;

    @FindBy(xpath = "//input[@value='Coach']")
    private WebElement economyClass_radioButton;

    @FindBy(xpath = "//input[@value='Business']")
    private WebElement businessClass_radioButton;

    @FindBy(xpath = "//input[@value='First']")
    private WebElement firstClass_radioButton;

    @FindBy(xpath = "//select[@name='airline']")
    private WebElement airline_dropDown;

    @FindBy(css = "input[name='findFlights']")
    private WebElement continue_button;

    public FlightsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickRoundTrip() {
        roundTrip_radioButton.click();
    }

    public void clickOneWayTrip() {
        oneway_radioButton.click();
    }

    public void selectPassengerCount(String count) {
        selectFromDropdownUsingVisibleText(passengerCount_dropDown, count);
    }

    public void selectDepartingFromCity(String city) {
        selectFromDropdownUsingVisibleText(departingFromCity_dropDown, city);
    }

    public void selectDepartingOnMonth(String month) {
        selectFromDropdownUsingVisibleText(departingOnMonth_dropDown, month);
    }

    public void selectDepartingOnDay(String day) {
        selectFromDropdownUsingVisibleText(departingOnDay_dropDown, day);
    }

    public void selectArrivingInCity(String city) {
        selectFromDropdownUsingVisibleText(arrivingIn_dropDown, city);
    }

    public void selectReturningOnMonth(String month) {
        selectFromDropdownUsingVisibleText(returningOnMonth_dropDown, month);
    }

    public void selectReturningOnDay(String day) {
        selectFromDropdownUsingVisibleText(returningOnDay_dropDown, day);
    }

    public void clickEconomyClass() {
        economyClass_radioButton.click();
    }

    public void clickBusinessClass() {
        businessClass_radioButton.click();
    }

    public void clickFirstClass() {
        firstClass_radioButton.click();
    }

    public void selectAirline(String airline) {
        selectFromDropdownUsingVisibleText(airline_dropDown, airline);
    }

    public void clickContinue() {
        continue_button.click();
    }

    public void selectFromDropdownUsingVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
}
