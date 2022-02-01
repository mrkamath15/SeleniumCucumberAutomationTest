package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginModule;
import pageObjects.RegisterPage;
import pageObjects.UnderConstructionModule;

public class PageObjectManager {
    WebDriver driver;
    LoginModule loginModule;
    HomePage homePage;
    UnderConstructionModule underConstructionModule;
    RegisterPage registerPage;

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
}
