package Steps;

import Pages.*;
import driver.Settings;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Steps {

    public ChromeDriver  driver;
    public  WebDriverWait wait;

    public StartPage startPage;
    public ProductsListPage productsListPage;
    public MyAccountPage myAccountPage;
    public CredentialPage credentialPage;


    @Before
    public void initializerDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-running-insecure-content");
//        driver = en.dt.driver.DriverInitializer.initDriver(BrowserType.CHROME_SELMGR);
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        startPage = new StartPage(driver);
        productsListPage = new ProductsListPage(driver);
        myAccountPage = new MyAccountPage(driver);
        credentialPage = new CredentialPage(driver);
    }

    @After
    public void closeDriver(){
        driver.quit();
    }

    @And("Accept cookies")
    public void acceptCookies() {
        startPage.clickOnAcceptCookies();
    }

    @Given("Open start page")
    public void openStartPage() {
        driver.get(Settings.getBaseUrl());
    }

    @When("Enter {string} into the search field")
    public void enterIntoTheSearchField(String arg0) {
        startPage.EnterValueInSearchField();
    }

    @Then("Click on the search button")
    public void clickOnTheSearchButton() {
        startPage.clickOnSearchLoupe();
    }

    @And("Click sign in button")
    public void clickSignInButton() {
        startPage.clickSignInBtnOnStartPage();
    }

    @When("Enter valid {string} and valid {string}")
    public void logIn(String arg0, String arg1) {
        credentialPage.enterEmail(arg0);
        credentialPage.enterPwd(arg1);
        credentialPage.clickOnSignInBtnOnMyAccountPage();
    }

    @And("Sign in to the site")
    public void signInToTheSite() {
        startPage.clickSignInBtnOnStartPage();
    }

    @Then("Check successful login")
    public void checkSuccessfulLogin() {
        startPage.checkLogInByName();
    }

    @Given("Click on My Account")
    public void clickOnMyAccount() {
        startPage.clickMyAccountOnStartPage();
    }

    @When("Click on Edit")
    public void clickOnEdit() {
        myAccountPage.clickOnEdit();
    }

    @And("Enter new {string} into the input field Surname")
    public void enterNewIntoTheInputFieldSurname(String arg0) {
        myAccountPage.clickOnNameField();
    }

    @And("Click on Save changes button")
    public void clickOnSaveChangesButton() {
        myAccountPage.clickOnSaveChangerBtn();
    }

    @Then("Compare expected and actual result")
    public void compareExpectedAndActualResult() {
    }

    @Then("Check that the {string} is found")
    public void checkThatTheIsFound(String arg0) {
    }

    @When("Enter invalid {string}")
    public void enterInvalid(String arg0) {
    }

    @Then("Check the error under Email address box")
    public void checkTheErrorUnderEmailAddressBox() {
    }

}
