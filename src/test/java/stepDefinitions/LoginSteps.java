package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.LoginModule;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver;
    PageObjectManager pageObjectManager;
    LoginModule loginModule;

    @Given("user is in home page")
    public void user_is_in_home_page() {
        System.setProperty("webdriver.chrome.driver", ".//src//test//resources//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        pageObjectManager = new PageObjectManager(driver);
        loginModule = pageObjectManager.getLoginModule();
        loginModule.enterUsername(username);
        loginModule.enterPassword(password);
    }

    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        loginModule.clickSubmit();
    }

    @Then("login success page is displayed")
    public void login_success_page_is_displayed() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/test/newtours/login_sucess.php");
    }

    @Then("login error {string} is displayed")
    public void login_error_is_displayed(String loginError) {
        Assert.assertEquals(loginModule.getLoginErrorMessage(), loginError);
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

}
