package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageObjectManager {
    WebDriver driver;
    LoginModule loginModule;
    HomePage homePage;
    UnderConstructionModule underConstructionModule;
    RegisterPage registerPage;
    FlightsPage flightsPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LoginModule getLoginModule() {
        return (loginModule == null) ? new LoginModule(driver) : loginModule;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? new HomePage(driver) : homePage;
    }

    public UnderConstructionModule getUnderConstructionModule() {
       return (underConstructionModule == null) ? new UnderConstructionModule(driver) : underConstructionModule;
    }

    public RegisterPage getRegisterPage() {
        return (registerPage == null) ? new RegisterPage(driver) : registerPage;
    }

    public FlightsPage getFlightsPage() {
        return (flightsPage == null) ? new FlightsPage(driver) : flightsPage;
    }
}
