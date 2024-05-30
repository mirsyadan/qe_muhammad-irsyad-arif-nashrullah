package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllPostData {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set valid API endpoint and method")
    public String setValidApiEndpointAndMethod() {
        return url + "posts";
    }

    @Step("I send a request to get all post data")
    public void sendARequestToGetAllPostData() {
        SerenityRest.given()
                .get(setValidApiEndpointAndMethod());
    }

    @Step("I receive the status code 200 OK")
    public void receiveTheStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I get all post data with valid")
    public void getAllPostDataWithValid() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_POST_DATA_SCHEMA);

        restAssuredThat(response -> response.body("userId", notNullValue()));
        restAssuredThat(response -> response.body("id", notNullValue()));
        restAssuredThat(response -> response.body("title", notNullValue()));
        restAssuredThat(response -> response.body("body", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    //NEGATIVE

    @Step("I set valid API endpoint and wrong method")
    public String setValidApiEndpointAndWrongMethod() {
        return url + "posts";
    }

    @Step("I send request to get all post data with invalid method")
    public void sendRequestToGetAllPostDataWithInvalidMethod() {
        SerenityRest.given()
                .patch(setValidApiEndpointAndWrongMethod());
    }

    @Step("I receive the status code 404 not found")
    public void receiveTheStatusCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    // NEGATIVE

    @Step("I set valid method and wrong API endpoint")
    public String setValidMethodAndWrongApiEndpoint() {
        return url + "post";
    }

    @Step("I send request to get all post data with invalid endpoint")
    public void sendRequestToGetAllPostDataWithInvalidEndpoint() {
        SerenityRest.given()
                .get(setValidMethodAndWrongApiEndpoint());
    }
    @Step("I receive in status code 404 not found")
    public void receiveInStatusCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
