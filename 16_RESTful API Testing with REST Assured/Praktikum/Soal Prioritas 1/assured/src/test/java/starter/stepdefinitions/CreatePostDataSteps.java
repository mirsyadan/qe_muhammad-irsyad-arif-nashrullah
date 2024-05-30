package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.CreatePostData;

public class CreatePostDataSteps {

    @Steps
    CreatePostData createPostData;

    @Given("I set endpoint and method with valid")
    public void setEndpointAndMethodWithValid(){
        createPostData.setEndpointAndMethodWithValid();
    }
    @When("I send a request to create post data")
    public void sendARequestToCreatePostData(){
        createPostData.sendARequestToCreatePostData();
    }
    @Then("I receive status code 201 created")
    public void receiveStatusCode201(){
        createPostData.receiveStatusCode201();
    }
    @And("I see new post data has create with valid")
    public void seeNewPostDataHasCreateWithValid(){
        createPostData.seeNewPostDataHasCreateWithValid();
    }
    @Given("I set wrong API endpoint and valid method")
    public void setWrongApiEndpointAndValidMethod(){
        createPostData.setWrongApiEndpointAndValidMethod();
    }
    @When("I send request to see new post data with invalid endpoint")
    public void sendRequestToSeeNewPostDataWithInvalidEndpoint(){
        createPostData.sendRequestToSeeNewPostDataWithInvalidEndpoint();
    }
    @Then("I received a status code 404 not found")
    public void receiveAStatusCode404(){
        createPostData.receiveAStatusCode404();
    }
}
