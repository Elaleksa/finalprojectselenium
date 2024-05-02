package driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class DriverInitializer {

    public static WebDriver initDriver(BrowserType type) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("safebrowsing.enabled", false);
        prefs.put("download.default_directory", System.getProperty("user.dir"));
        prefs.put("download.prompt_for_download", false);
        prefs.put("download.directory_upgrade", true);
        prefs.put("cmd", "Page.setDownloadBehavior");
        prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("behavior", "allow");
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-gpu");
        //options.addArguments("--headless=new");
        options.addArguments("window-size=1980,1080");
        options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-extensions");
        options.addArguments("--no-sandbox");
        options.addArguments("--test-type");
        options.addArguments("--disable-web-security");

        switch (type) {
            case CHROME_SELMGR:
                return new ChromeDriver(options);
            default:
                throw new IllegalArgumentException("Incorrect browser type!");
        }
    }
}