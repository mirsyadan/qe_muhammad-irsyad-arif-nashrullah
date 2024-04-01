package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps {

    @Given("I on the main home page")
    public void onMainHomePage() { }

    @When("I select the credit service feature")
    public void selectCreditServiceFeature() { }

    @And("I filled in a valid phone number")
    public void phoneNumberValidInput() { }

    @And("I chose the available credit nominal")
    public void choseAvailableCreditNominal() { }

    @And("I chooses the available payment method")
    public void choosesAvailablePaymentMethod() { }

    @And("I carried out and completed the payment process")
    public void carriedCompletedPaymentProcess() { }

    @Then("I completed the credit top up process successfully")
    public void topUpProcessSuccessfully() { }

    @And("I filled in the phone number with an invalid input")
    public void phoneNumberInvalidInput() { }

    @Then("I get an error message stating that the phone number is overloaded, the maximum is 13 digits")
    public void getErrorMessage() { }
}
