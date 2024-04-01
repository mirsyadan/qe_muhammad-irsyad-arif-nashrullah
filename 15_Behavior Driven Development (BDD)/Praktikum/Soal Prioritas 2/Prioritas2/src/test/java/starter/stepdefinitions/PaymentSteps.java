package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentSteps {

    @Given("I in the main home page")
    public void inMainHomePage() { }

    @When("I chose the credit top up service")
    public void choseCreditTopUp() { }

    @And("I entered a valid phone number")
    public void enteredValidPhoneNumber() { }

    @And("I selected an available credit nominal")
    public void selectedAvailableCreditNominal() { }

    @And("I selected an available payment method")
    public void selectedAvailablePaymentNominal() { }

    @And("I have made and completed the payment process")
    public void completedPaymentProcess() { }

    @Then("I successfully completed the credit top up process")
    public void successfullyCompletedCreditProcess() { }

    @And("I didn't carry out and complete the payment process")
    public void doNotCarryComplete() { }

    @Then("I failed to complete the credit top up process")
    public void failedCreditTopUp() { }
}
