package managers;

import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    WebDriver driver;
    BrowserType browserType;

    public WebDriverManager() {
        browserType = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
    }

    public WebDriver getDriver() {
        if (driver == null) {
            driver = createDriver();
        }
        return driver;
    }

    private WebDriver createDriver() {
        switch (browserType) {
            case CHROME:
                System.setProperty(browserType.property, FileReaderManager.getInstance().getConfigFileReader().getDriverPath());
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                System.setProperty(browserType.property, FileReaderManager.getInstance().getConfigFileReader().getDriverPath());
                driver = new FirefoxDriver();
                break;
            case INTERNET_EXPLORER:
                System.setProperty(browserType.property, FileReaderManager.getInstance().getConfigFileReader().getDriverPath());
                driver = new InternetExplorerDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigFileReader().getTimeout(), TimeUnit.SECONDS);
        return driver;
    }

}
