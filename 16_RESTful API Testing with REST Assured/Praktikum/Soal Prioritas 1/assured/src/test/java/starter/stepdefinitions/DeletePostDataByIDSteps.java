package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.DeletePostDataByID;

public class DeletePostDataByIDSteps {

    @Steps
    DeletePostDataByID deletePostDataByID;

    @Given("I set valid endpoint and method")
    public void setValidEndpointAndMethod(){
        deletePostDataByID.setValidEndpointAndMethod();
    }
    @When("I send a request to delete post data")
    public void sendARequestToDeletePostData(){
        deletePostDataByID.sendARequestToDeletePostData();
    }
    @Then("I receive in status code 200 OK")
    public void receiveInStatusCode200(){
        deletePostDataByID.receiveInStatusCode200();
    }
    @And("I see post data has delete with valid")
    public void seePostDataHasDeleteWithValid(){
        deletePostDataByID.seePostDataHasDeleteWithValid();
    }
    @Given("I set valid method and wrong endpoint")
    public void setValidMethodAndWrongEndpoint(){
        deletePostDataByID.setValidMethodAndWrongEndpoint();
    }
    @When("I send request to delete post data with invalid endpoint")
    public void sendRequestToDeletePostDataWithInvalidEndpoint(){
        deletePostDataByID.sendRequestToDeletePostDataWithInvalidEndpoint();
    }
    @Then("I received in status code 404 not found")
    public void receivedInStatusCode404(){
        deletePostDataByID.receivedInStatusCode404();
    }
}