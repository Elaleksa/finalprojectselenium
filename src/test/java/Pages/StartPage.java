package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.awt.SystemColor.text;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartPage extends BasePage{

    By xpathacceptCookiesBtn = By.xpath("//*[@id=\"sticky-bar-cookie-wrapper\"]/span/div/div/div[2]/form[1]/button");
    By xpathSignOnBtnStartPage = By.xpath("//a[@class='button button-primary']");
    By idGreetings = By.id("utility-header-greetings");
    By idSearchField = By.id("search-input");
    By xpathSearchBtn = By.xpath("//button[@class='styled__StyledIconButton-sc-rnkc1-1 dSPDba search-bar__submit ddsweb-button ddsweb-button--icon-button']");
    By xpathMyAccount = By.xpath("//span[@class='styled__Text-sc-1i711qa-1 xZAYu ddsweb-link__text']");

    public StartPage(ChromeDriver driver) {
        super(driver);
    }

    public void clickOnAcceptCookies(){
        WebElement webElement = driver.findElement(xpathacceptCookiesBtn);
        webElement.click();
    }
    public void clickSignInBtnOnStartPage(){
        WebElement webElementSignInBtnStartPage = driver.findElement(xpathSignOnBtnStartPage);
        webElementSignInBtnStartPage.click();
    }

    public void checkLogInByName(){
        WebElement webElementCheckLoginByName = driver.findElement(idGreetings);
        webElementCheckLoginByName.isDisplayed();
        assertEquals(webElementCheckLoginByName.getText(), text);
    }

    public void clickMyAccountOnStartPage(){
        WebElement webElementMyAccount = driver.findElement(xpathMyAccount);
        driver.findElement(xpathMyAccount).isEnabled();
        webElementMyAccount.click();
    }

    public void EnterValueInSearchField(){
        WebElement webElementSearchFieldOnStartPage = driver.findElement(idSearchField);
        driver.findElement(idSearchField).isEnabled();
        webElementSearchFieldOnStartPage.getText();
    }

    public void clickOnSearchLoupe(){
        WebElement webElementSearchLoupe = driver.findElement(xpathSearchBtn);
        driver.findElement(xpathSearchBtn).click();
    }
}