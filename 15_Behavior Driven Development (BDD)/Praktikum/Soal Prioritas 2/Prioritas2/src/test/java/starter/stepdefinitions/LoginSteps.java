package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("I am on the login page")
    public void onLoginPage() { }

    @When("I fill in a valid registered email address or telephone number")
    public void fillValidInput() { }

    @And("I filled in the registered password validly")
    public void filledPasswordValidInput() { }

    @And("I pressed the login button")
    public void pressedLoginButton() { }

    @Then("I was directed to the main home page")
    public void directedMainHomePage() { }

    @When("I fill in an email address or telephone number that is not registered and invalid")
    public void fillInvalidInput() { }

    @And("I filled in an unregistered and invalid password")
    public void filledPasswordInvalidInput() { }

    @Then("I get an error message stating that the email address or phone number or password is incorrect")
    public void errorMessage() { }
}
