package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.GetAllPostData;

public class GetAllPostDataSteps {

    @Steps
    GetAllPostData getAllPostData;

    @Given("I set valid API endpoint and method")
    public void setValidApiEndpointAndMethod(){
        getAllPostData.setValidApiEndpointAndMethod();
    }
    @When("I send a request to get all post data")
    public void sendARequestToGetAllPostData(){
        getAllPostData.sendARequestToGetAllPostData();
    }
    @Then("I receive the status code 200 OK")
    public void receiveTheStatusCode200(){
        getAllPostData.receiveTheStatusCode200();
    }
    @And("I get all post data with valid")
    public void getAllPostDataWithValid(){
        getAllPostData.getAllPostDataWithValid();
    }
    @Given("I set valid API endpoint and wrong method")
    public void setValidApiEndpointAndWrongMethod(){
        getAllPostData.setValidApiEndpointAndWrongMethod();
    }
    @When("I send request to get all post data with invalid method")
    public void sendRequestToGetAllPostDataWithInvalidMethod(){
        getAllPostData.sendRequestToGetAllPostDataWithInvalidMethod();
    }
    @Then("I receive the status code 404 not found")
    public void receiveTheStatusCode404(){
        getAllPostData.receiveTheStatusCode404();
    }
    @Given("I set valid method and wrong API endpoint")
    public void setValidMethodAndWrongApiEndpoint(){
        getAllPostData.setValidMethodAndWrongApiEndpoint();
    }
    @When("I send request to get all post data with invalid endpoint")
    public void sendRequestToGetAllPostDataWithInvalidEndpoint(){
        getAllPostData.sendRequestToGetAllPostDataWithInvalidEndpoint();
    }
    @Then("I receive in status code 404 not found")
    public void receiveInStatusCode404(){
        getAllPostData.receiveInStatusCode404();
    }
}
