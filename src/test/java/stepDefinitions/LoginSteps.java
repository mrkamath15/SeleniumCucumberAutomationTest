package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.LoginModule;
import utility.TestContext;

public class LoginSteps {
    WebDriver driver;
    LoginModule loginModule;

    public LoginSteps(TestContext context) {
        driver = context.getWebDriverManager().getDriver();
        loginModule = context.getPageObjectManager().getLoginModule();
    }

    @Given("user is in home page")
    public void user_is_in_home_page() {
        driver.get(FileReaderManager.getInstance().getConfigFileReader().getApplicationUrl());
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
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
}
