package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {

    WebDriver driver;
    By xpathSignInBtnStartPage = By.xpath("//a[@class='button button-primary']");
    By idGreetings = By.id("utility-header-greetings");
    By idSearchField = By.id("search-input");
    By xpathSearchBtn = By.xpath("//button[@class='styled__StyledIconButton-sc-rnkc1-1 dSPDba search-bar__submit ddsweb-button ddsweb-button--icon-button']");
    By xpathMyAccount = By.xpath("//span[@class='styled__Text-sc-1i711qa-1 xZAYu ddsweb-link__text']");

    @Given("Open start page")
    public void openStartPage() {
        
    }

    @And("Click sign in button")
    public void clickSignInButton() {
        
    }

    @Then("Check successful login")
    public void checkSuccessfulLogin() {
    }

    @When("Enter {string} into the search field")
    public void enterIntoTheSearchField(String arg0) {
        
    }

    @And("Click on the search button")
    public void clickOnTheSearchButton() {
    }

    @Given("Click on My Account")
    public void clickOnMyAccount() {
    }
}
