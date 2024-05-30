package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreatePostData {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set endpoint and method with valid")
    public String setEndpointAndMethodWithValid() {
        return url + "posts";
    }

    @Step("I send a request to create post data")
    public void sendARequestToCreatePostData() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", 11);
        requestBody.put("id", 101);
        requestBody.put("title", "LOREM IPSUM" );
        requestBody.put("body", "DOLOR SIT AMET");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post(setEndpointAndMethodWithValid());
    }

    @Step("I receive status code 201 ")
    public void receiveStatusCode201() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I see new post data has create with valid")
    public void seeNewPostDataHasCreateWithValid() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_POST_DATA_SCHEMA);

        restAssuredThat(response -> response.body("'userId'", equalTo(11)));
        restAssuredThat(response -> response.body("'id'", equalTo(101)));
        restAssuredThat(response -> response.body("'title'", equalTo("LOREM IPSUM")));
        restAssuredThat(response -> response.body("'body'", equalTo("DOLOR SIT AMET")));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    // NEGATIVE

    @Step("I set wrong API endpoint and valid method")
    public String setWrongApiEndpointAndValidMethod() {
        return url + "post";
    }

    @Step("I send request to see new post data with invalid endpoint")
    public void sendRequestToSeeNewPostDataWithInvalidEndpoint() {
        SerenityRest.given()
                .get(setWrongApiEndpointAndValidMethod());
    }
    @Step("I received a status code 404 not found")
    public void receiveAStatusCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
