package stepDefinitions;

import io.cucumber.java.en.When;
import pageObjects.RegisterPage;
import utility.TestContext;

public class RegisterPageSteps {
    RegisterPage registerPage;

    public RegisterPageSteps(TestContext context) {
        registerPage = context.getPageObjectManager().getRegisterPage();
    }

    @When("user fills all registration details")
    public void user_fills_all_registration_details() {
        registerPage.enterFirstName("Raj");
        registerPage.enterLastName("Kundraa");
        registerPage.enterPhoneNumber("987765324");
        registerPage.enterEmail("qwerty@qwe.com");
        registerPage.enterAddress("12 Born street");
        registerPage.enterCity("Toronto");
        registerPage.enterState("Delhi");
        registerPage.enterPostalCode("232323");
        registerPage.selectCountry("INDIA");
        registerPage.enterUsername("popo");
        registerPage.enterPassword("asdf");
        registerPage.enterConfirmPassword("asdf");
    }
}
