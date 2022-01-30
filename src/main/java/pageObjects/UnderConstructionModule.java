package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnderConstructionModule {

    @FindBy(xpath = "//img[@src='images/mast_construction.gif']")
    private WebElement underConstruction_image;

    @FindBy(xpath = "//img[@src='images/home.gif']")
    private WebElement backToHome_image;

    public UnderConstructionModule(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isUnderConstructionImageDisplayed() {
        return underConstruction_image.isDisplayed();
    }

    public boolean isBackToHomeImageDisplayed() {
        return backToHome_image.isDisplayed();
    }

    public void clickBackToHomeImageLink() {
        backToHome_image.click();
    }
}
