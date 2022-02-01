package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utility.TestContext;

public class RegisterSuccessSteps {
    WebDriver driver;

    public RegisterSuccessSteps(TestContext context) {
        driver = context.getWebDriverManager().getDriver();
    }

    @When("registration success page is displayed")
    public void registration_success_page_is_displayed() {
        Assert.assertEquals("https://demo.guru99.com/test/newtours/register_sucess.php", driver.getCurrentUrl());
    }
}
