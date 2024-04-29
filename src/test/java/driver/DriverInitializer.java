package en.dt.driver;

import driver.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitializer {

    public static WebDriver initChrome() { return initDriver(BrowserType.CHROME_SELMGR); }

    public static WebDriver initFirefox() {
        return initDriver(BrowserType.FIREFOX_SELMGR);
    }

    public static WebDriver initDriver(BrowserType type) {
        switch (type) {
            case CHROME_SELMGR:
                return new ChromeDriver();
            case FIREFOX_SELMGR:
                return new FirefoxDriver();
            default:
                throw new IllegalArgumentException("Incorrect browser type!");
        }
    }
}