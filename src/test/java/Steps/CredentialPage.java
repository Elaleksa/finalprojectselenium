package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CredentialPage extends BasePage{

    WebDriver driver;
    By idEmail = By.id("email");
    By idPwd = By.id("password");
    By xpathSignInBtnOnMyAccountPage = By.xpath("//span[text()='Sign in']");
    By idPwdError = By.id("password-error");

    @When("Enter valid {string} and valid {string}")
    public void enterValidAndValid(String arg0, String arg1) {
        
    }

    @And("Sign in to the site")
    public void signInToTheSite() {
    }

    @When("Enter invalid {string}")
    public void enterInvalid(String arg0) {
    }

    @Then("Check the error under Email address box")
    public void checkTheErrorUnderEmailAddressBox() {
    }

}
