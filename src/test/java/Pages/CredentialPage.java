package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.awt.SystemColor.text;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CredentialPage extends BasePage{
    By idEmail = By.id("email");
    By idPwd = By.id("password");
//    By xpathSignInBtnOnMyAccountPage = By.xpath("//span[text()='Sign in']");
    By idPwdError = By.id("password-error");

    public CredentialPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email){
        WebElement webElementEmailField = driver.findElement(idEmail);
        webElementEmailField.isEnabled();
        webElementEmailField.sendKeys(email);
    }

    public void enterPwd(String psw){
        WebElement webElementPwdField = driver.findElement(idPwd);
        webElementPwdField.isEnabled();
        webElementPwdField.sendKeys(psw);
    }

//    public void clickOnSignInBtnOnMyAccountPage(){
//        WebElement webElementSignInBtnOnMyAccountPage = driver.findElement(xpathSignInBtnOnMyAccountPage);
//        webElementSignInBtnOnMyAccountPage.click();
//    }

    public void checkError(){
        WebElement webElementPwdError = driver.findElement(idPwdError);
        webElementPwdError.isDisplayed();
        assertEquals(idPwdError.getClass(), text);
    }
}

