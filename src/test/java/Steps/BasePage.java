package Steps;

import en.dt.driver.DriverInitializer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

//    static {
//        driver = DriverInitializer.initChrome();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    }
}