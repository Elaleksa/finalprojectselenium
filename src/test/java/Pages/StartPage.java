package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartPage extends BasePage{

//    By xpathacceptCookiesBtn = By.xpath("//*[@id=\"sticky-bar-cookie-wrapper\"]/span/div/div/div[2]/form[1]/button");
    By xpathSignOnBtnStartPage = By.xpath("//a[@class='button button-primary']");
    By xpathSignOnBtnLogInPage = By.xpath("//*[@id=\"signin-button\"]/span/span");
    By idGreetings = By.xpath("//*[@id=\"utility-header-greetings\"]");
    By idSearchField = By.id("search-input");
    By xpathSearchBtn = By.xpath("//button[@class='styled__StyledIconButton-sc-rnkc1-1 dSPDba search-bar__submit ddsweb-button ddsweb-button--icon-button']");
    By xpathMyAccount = By.xpath("//*[@id=\"utility-header-account-link\"]/span");

    public StartPage(WebDriver driver) {
        super(driver);
    }

//    public void clickOnAcceptCookies(){
//        WebElement webElement = driver.findElement(xpathacceptCookiesBtn);
//        webElement.click();
//    }
    public void clickSignInBtnOnStartPage(){
        WebElement webElementSignInBtnStartPage = driver.findElement(xpathSignOnBtnStartPage);
        webElementSignInBtnStartPage.click();
    }

    public void checkLogInByName(){
        WebElement webElementCheckLoginByName = driver.findElement(idGreetings);
        webElementCheckLoginByName.isDisplayed();
        String actualText = webElementCheckLoginByName.getText();
        assertEquals(actualText, "Hello Elizaveta");
    }
    public void clickSignInBtnOnLogInPage(){
        WebElement webElementLogInBtnMyCr = driver.findElement(xpathSignOnBtnLogInPage);
        webElementLogInBtnMyCr.click();
    }

    public void clickMyAccountOnStartPage(){
        WebElement webElementMyAccount = driver.findElement(xpathMyAccount);
        webElementMyAccount.isEnabled();
        webElementMyAccount.click();
    }

    public void EnterValueInSearchField(String arg0){
        WebElement webElementSearchFieldOnStartPage = driver.findElement(idSearchField);
        webElementSearchFieldOnStartPage.isEnabled();
        webElementSearchFieldOnStartPage.sendKeys(arg0);
    }

    public void clickOnSearchLoupe(){
        WebElement webElementSearchLoupe = driver.findElement(xpathSearchBtn);
        webElementSearchLoupe.click();
    }
}
