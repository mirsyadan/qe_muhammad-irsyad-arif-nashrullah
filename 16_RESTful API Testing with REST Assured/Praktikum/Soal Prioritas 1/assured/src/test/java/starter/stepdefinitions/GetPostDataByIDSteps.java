package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.GetPostDataByID;

public class GetPostDataByIDSteps {

    @Steps
    GetPostDataByID getPostDataByID;

    @Given("I set API endpoint and method with valid")
    public void setApiEndpointAndMethodWithValid(){
        getPostDataByID.setApiEndpointAndMethodWithValid();
    }
    @When("I send a request to get post data by ID")
    public void sendARequestToGetPostDataById(){
        getPostDataByID.sendARequestToGetPostDataById();
    }
    @Then("I get status code 200 OK")
    public void getStatusCode200(){
        getPostDataByID.getStatusCode200();
    }
    @And("I get post data by ID with valid")
    public void getPostDataByIdWithValid(){
        getPostDataByID.getPostDataByIdWithValid();
    }
    @Given("I set with valid method and wrong API endpoint")
    public void setWithValidMethodAndWrongApiEndpoint(){
        getPostDataByID.setWithValidMethodAndWrongApiEndpoint();
    }
    @When("I send request to get post data by ID with invalid endpoint")
    public void sendRequestToGetPostDataByIdWithInvalidEndpoint(){
        getPostDataByID.sendRequestToGetPostDataByIdWithInvalidEndpoint();
    }
    @Then("I get status code 404 not found")
    public void getStatusCode404(){
        getPostDataByID.getStatusCode404();
    }
}
