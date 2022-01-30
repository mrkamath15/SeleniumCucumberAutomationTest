package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(linkText = "SIGN-ON")
    private WebElement signOn_link;

    @FindBy(linkText = "REGISTER")
    private WebElement register_link;

    @FindBy(linkText = "SUPPORT")
    private WebElement support_link;

    @FindBy(linkText = "CONTACT")
    private WebElement contact_link;

    @FindBy(linkText = "Flights")
    private WebElement flights_link;

    @FindBy(linkText = "Hotels")
    private WebElement hotels_link;

    @FindBy(linkText = "Car Rentals")
    private WebElement car_rentals_link;

    @FindBy(linkText = "Destinations")
    private WebElement destinations_link;

    @FindBy(linkText = "Vacations")
    private WebElement vacations_link;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickSignOnLink() {
        signOn_link.click();
    }

    public void clickRegisterLink() {
        register_link.click();
    }

    public void clickSupportLink() {
        support_link.click();
    }

    public void clickContactLink() {
        contact_link.click();
    }

    public void clickFlightsLink() {
        flights_link.click();
    }

    public void clickHotelsLink() {
        hotels_link.click();
    }

    public void clickCarRentalsLink() {
        car_rentals_link.click();
    }

    public void clickDestinationsLink() {
        destinations_link.click();
    }

    public void clickVacationsLink() {
        vacations_link.click();
    }

}
