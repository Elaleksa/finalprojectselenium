package Pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static java.awt.SystemColor.text;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MyAccountPage extends BasePage{

    By xpathEditBtn = By.xpath("//a[@class='button account-settings--form--actions--edit']");
    @FindBy(xpath = "//a[@class='button account-settings--form--actions--edit']")
    SelenideElement xpathEditBtnSelenide;
    By idLastNameField = By.id("last-name");
    By xpathSaveChangesBtn = By.xpath("//span[text()='Save changes']");
    By xpathLastNameAndFirstName = By.xpath("//*[@id=\"personal-details\"]/div/div[1]/span");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnEdit(){
        xpathEditBtnSelenide.shouldBe(visible, enabled);
        xpathEditBtnSelenide.click();
    }

    public void enterSurname(String arg0) {
        WebElement webElementNameField = driver.findElement(idLastNameField);
        wait.until(ExpectedConditions.visibilityOf(webElementNameField)).isEnabled();

        // todo does not work. works only during debugging
        driver.findElement(idLastNameField).clear();

        webElementNameField.sendKeys(arg0);
    }

    public void clickOnSaveChangerBtn(){
        WebElement webElementSaveChangerBtn = driver.findElement(xpathSaveChangesBtn);
        webElementSaveChangerBtn.click();
    }

    public void compareSurname(String surname){
        WebElement webElementLasAndFirstNAme = driver.findElement(xpathLastNameAndFirstName);
        wait.until(ExpectedConditions.visibilityOf(webElementLasAndFirstNAme)).isDisplayed();
        String actualText = webElementLasAndFirstNAme.getText();
        assertNotEquals(surname, actualText);
    }

}
