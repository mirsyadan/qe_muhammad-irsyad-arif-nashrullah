package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeletePostDataByID {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set valid endpoint and method")
    public String setValidEndpointAndMethod() {
        return url + "posts/1";
    }

    @Step("I send a request to delete post data")
    public void sendARequestToDeletePostData() {
        SerenityRest.given()
                .delete(setValidEndpointAndMethod());
    }

    @Step("I receive in status code 200 OK")
    public void receiveInStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I see post data has delete with valid")
    public void seePostDataHasDeleteWithValid() {
    }

    // NEGATIVE

    @Step("I set valid method and wrong endpoint")
    public String setValidMethodAndWrongEndpoint() {
        return url + "post/1";
    }

    @Step("I send request to delete post data with invalid endpoint")
    public void sendRequestToDeletePostDataWithInvalidEndpoint() {
        SerenityRest.given()
                .get(setValidMethodAndWrongEndpoint());
    }
    @Step("I received in status code 404 not found")
    public void receivedInStatusCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}