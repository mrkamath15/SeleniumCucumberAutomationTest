package enums;

public enum BrowserType {
    CHROME("webdriver.chrome.driver"),
    INTERNET_EXPLORER("webdriver.ie.driver"),
    FIREFOX("webdriver.gecko.driver");

    public String property;

    private BrowserType(String property) {
        this.property = property;
    }
}
