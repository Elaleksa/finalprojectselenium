package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{

    By xpathEditBtn = By.xpath("//a[@class='button account-settings--form--actions--edit']");
    By idLastNameField = By.id("last-name");
    By xpathSaveChangesBtn = By.xpath("//span[text()='Save changes']");


    @When("Click on Edit")
    public void clickOnEdit() {

    }

    @And("Enter new {string} into the input field Surname")
    public void enterNewIntoTheInputFieldSurname(String arg0) {

    }

    @And("Click on Save changes button")
    public void clickOnSaveChangesButton() {

    }

    @Then("Compare expected and actual result")
    public void compareExpectedAndActualResult() {
    }
}
