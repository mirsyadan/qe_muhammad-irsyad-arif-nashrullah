package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommentSteps {

    @Given("I in LinkedIn main homepage")
    public void inMainHomepage() { }

    @When("I saw a content post on the homepage")
    public void sawContent() { }

    @And("I pressed the comment feature button")
    public void pressedButton() { }

    @And("I filled in the comments")
    public void filledComments() { }

    @And("I press the post button")
    public void pressButton() { }

    @Then("I managed to post and see the comments that have been posted")
    public void successPostComments() { }

    @And("I don't fill in comments")
    public void doNotFillComments() { }

    @Then("I noticed the post button was not working so I couldn't post a comment")
    public void noticedPostButton() { }
}
