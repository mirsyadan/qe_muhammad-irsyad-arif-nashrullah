package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

    @Given("I am on LinkedIn main home page")
    public void onMainHomePage() { }

    @When("I see a search icon")
    public void seeIcon() { }

    @And("I pressed the search icon")
    public void pressedIcon() { }

    @And("I entered my name in the search feature column")
    public void pressEnter() { }

    @And("I pressed the enter key")
    public void pressedEnter() { }

    @Then("I see search results that display my LinkedIn profile account")
    public void seeResults() { }

    @And("I entered someone else's name in the search feature column")
    public void enterName() { }

    @Then("I saw search results that displayed other people's LinkedIn profile accounts")
    public void sawResults() { }
}
