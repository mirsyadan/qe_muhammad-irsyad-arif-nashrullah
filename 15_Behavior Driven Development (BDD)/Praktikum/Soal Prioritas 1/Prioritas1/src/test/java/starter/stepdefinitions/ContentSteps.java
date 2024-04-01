package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContentSteps {

    @Given("I on LinkedIn main homepage")
    public void onMainHomepage() { }

    @When("I see a column for creating a new post")
    public void seeColumn() { }

    @And("I hit the feature column to create a new post")
    public void hitColumn() { }

    @And("I filled in the content description in the column provided")
    public void fillDescription() { }

    @And("I hit the post button")
    public void hitButton() { }

    @Then("I successfully posted and saw my latest content post")
    public void successfullyPosted() { }

    @And("I didn't fill in anything in the columns provided")
    public void doNotfillColumns() { }

    @Then("I can't post content because the post button doesn't work")
    public void cantPostContent() { }
}
