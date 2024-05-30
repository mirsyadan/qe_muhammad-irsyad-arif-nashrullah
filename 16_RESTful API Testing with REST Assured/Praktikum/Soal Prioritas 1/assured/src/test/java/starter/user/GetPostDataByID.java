package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class GetPostDataByID {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint and method with valid")
    public String setApiEndpointAndMethodWithValid() {
        return url + "posts/1";
    }

    @Step("I send a request to get post data by ID")
    public void sendARequestToGetPostDataById() {
        SerenityRest.given()
                .get(setApiEndpointAndMethodWithValid());
    }

    @Step("I get status code 200 OK")
    public void getStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I get post data by ID with valid")
    public void getPostDataByIdWithValid() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_POST_DATA_BY_ID_SCHEMA);

        restAssuredThat(response -> response.body("userId", notNullValue()));
        restAssuredThat(response -> response.body("id", notNullValue()));
        restAssuredThat(response -> response.body("title", notNullValue()));
        restAssuredThat(response -> response.body("body", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    //NEGATIVE

    @Step("I set with valid method and wrong API endpoint")
    public String setWithValidMethodAndWrongApiEndpoint() {
        return url + "post/1";
    }

    @Step("I send request to get post data by ID with invalid endpoint")
    public void sendRequestToGetPostDataByIdWithInvalidEndpoint() {
        SerenityRest.given()
                .get(setWithValidMethodAndWrongApiEndpoint());
    }
    @Step("I get status code 404 not found")
    public void getStatusCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
