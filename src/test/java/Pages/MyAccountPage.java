package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.awt.SystemColor.text;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAccountPage extends BasePage{

    By xpathEditBtn = By.xpath("//a[@class='button account-settings--form--actions--edit']");
    By idLastNameField = By.id("last-name");
    By xpathSaveChangesBtn = By.xpath("//span[text()='Save changes']");

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnEdit(){
        driver.findElement(xpathEditBtn).click();
    }

    public void clickOnNameField(){
        WebElement webElementNameField = driver.findElement(idLastNameField);
        webElementNameField.isEnabled();
        webElementNameField.getText();

        assertEquals(idLastNameField.getClass(),text);
    }

    public void clickOnSaveChangerBtn(){
        WebElement webElementSaveChangerBtn = driver.findElement(xpathSaveChangesBtn);
        webElementSaveChangerBtn.click();
    }

}
