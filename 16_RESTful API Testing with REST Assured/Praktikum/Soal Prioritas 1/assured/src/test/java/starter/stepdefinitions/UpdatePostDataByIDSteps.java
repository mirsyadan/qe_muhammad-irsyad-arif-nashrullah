package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.UpdatePostDataByID;

public class UpdatePostDataByIDSteps {

    @Steps
    UpdatePostDataByID updatePostDataByID;

    @Given("I set with valid API endpoint and method")
    public void setWithValidApiEndpointAndMethod(){
        updatePostDataByID.setWithValidApiEndpointAndMethod();
    }
    @When("I send a request to update post data by ID")
    public void sendARequestToUpdatePostDataById(){
        updatePostDataByID.sendARequestToUpdatePostDataById();
    }
    @Then("I receive a status code 200 OK")
    public void receiveAStatusCode200(){
        updatePostDataByID.receiveAStatusCode200();
    }
    @And("I see post data has updated with valid")
    public void seePostDataHasUpdatedWithValid(){
        updatePostDataByID.seePostDataHasUpdatedWithValid();
    }
    @Given("I set with valid method and wrong endpoint")
    public void setWithValidMethodAndWrongEndpoint(){
        updatePostDataByID.setWithValidMethodAndWrongEndpoint();
    }
    @When("I send request to update post data by ID with invalid endpoint")
    public void sendRequestToUpdatePostDataByIdWithInvalidEndpoint(){
        updatePostDataByID.sendRequestToUpdatePostDataByIdWithInvalidEndpoint();
    }
    @Then("I receive a status code 404 not found")
    public void receiveAStatusCode404(){
        updatePostDataByID.receiveAStatusCode404();
    }
}
