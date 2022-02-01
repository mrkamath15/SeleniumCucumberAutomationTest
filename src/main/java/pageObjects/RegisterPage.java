package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstName_textField;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastName_textField;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phone_textField;

    @FindBy(css = "input[id='userName']")
    private WebElement email_textField;

    @FindBy(xpath = "//input[@name='address1']")
    private WebElement address_textField;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement city_textField;

    @FindBy(xpath = "//input[@name='state']")
    private WebElement state_textField;

    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement postalCode_textField;

    @FindBy(name = "country")
    private WebElement country_dropDown;

    @FindBy(id = "email")
    private WebElement username_textField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password_textField;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    private WebElement confirmPassword_textField;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submit_button;

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstName) {
        firstName_textField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastName_textField.sendKeys(lastName);
    }

    public void enterPhoneNumber(String phone) {
        phone_textField.sendKeys(phone);
    }

    public void enterEmail(String email) {
        email_textField.sendKeys(email);
    }

    public void enterAddress(String address) {
        address_textField.sendKeys(address);
    }

    public void enterCity(String city) {
        city_textField.sendKeys(city);
    }

    public void enterState(String state) {
        state_textField.sendKeys(state);
    }

    public void enterPostalCode(String postalCode) {
        postalCode_textField.sendKeys(postalCode);
    }

    public void selectCountry(String country) {
        Select select = new Select(country_dropDown);
        select.selectByVisibleText(country);
    }

    public void enterUsername(String username) {
        username_textField.sendKeys(username);
    }

    public void enterPassword(String password) {
        password_textField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPassword_textField.sendKeys(confirmPassword);
    }

    public void clickSubmit() {
        submit_button.click();
    }
}
