package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.LoginModule;

public class PageObjectManager {
    WebDriver driver;
    LoginModule loginModule;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LoginModule getLoginModule() {
        return (loginModule == null) ? new LoginModule(driver) : loginModule;
    }
}
