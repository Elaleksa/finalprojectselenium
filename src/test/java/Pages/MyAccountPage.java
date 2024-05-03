package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public void clickOnNameField(String arg0){
        WebElement webElementNameField = driver.findElement(idLastNameField);
        webElementNameField.isEnabled();

        webElementNameField.clear();
        webElementNameField.isEnabled();

        webElementNameField.sendKeys(arg0);

        //assertEquals(idLastNameField.getClass(),text);
    }

    public void compareSurname(String arg0){
        WebElement webElementNameField = driver.findElement(idLastNameField);
        String actualText = webElementNameField.getText();
        assertEquals(actualText, "Alexandrova");
    }

    public void clickOnSaveChangerBtn(){
        WebElement webElementSaveChangerBtn = driver.findElement(xpathSaveChangesBtn);
        webElementSaveChangerBtn.click();
    }

}
