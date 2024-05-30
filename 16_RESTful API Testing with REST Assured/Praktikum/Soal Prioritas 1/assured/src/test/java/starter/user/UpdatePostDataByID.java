package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdatePostDataByID {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set with valid API endpoint and method")
    public String setWithValidApiEndpointAndMethod() {
        return url + "posts/1";
    }

    @Step("I send a request to update post data by ID")
    public void sendARequestToUpdatePostDataById() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", 1);
        requestBody.put("id", 1);
        requestBody.put("title", "LOREM IPSUM" );
        requestBody.put("body", "DOLOR SIT AMET");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .put(setWithValidApiEndpointAndMethod());
    }

    @Step("I receive a status code 200 OK")
    public void receiveAStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I see post data has updated with valid")
    public void seePostDataHasUpdatedWithValid() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_POST_DATA_BY_ID_SCHEMA);

        restAssuredThat(response -> response.body("'userId'", equalTo(1)));
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'title'", equalTo("LOREM IPSUM")));
        restAssuredThat(response -> response.body("'body'", equalTo("DOLOR SIT AMET")));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    //NEGATIVE

    @Step("I set with valid method and wrong endpoint")
    public String setWithValidMethodAndWrongEndpoint() {
        return url + "post/1";
    }

    @Step("I send request to update post data by ID with invalid endpoint")
    public void sendRequestToUpdatePostDataByIdWithInvalidEndpoint() {
        SerenityRest.given()
                .get(setWithValidMethodAndWrongEndpoint());
    }
    @Step("I receive a status code 404 not found")
    public void receiveAStatusCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
