package controllers;

import
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserController {
    RequestSpecification requestSpecification;
    private static final String BASE_URI = "https://petstore.swagger.io/v2/";
    private static final String USER_ENDPOINT = "user";

    public UserController() {
        this.requestSpecification = given()
                .accept(JSON)
                .contentType(JSON)
                .baseUri(BASE_URI);
    }

    public Response createUser(User user) {
        return given(this.requestSpecification)
                    .body(user)
                .when()
                    .post(USER_ENDPOINT)
                    .andReturn;
    }

    public Response updateUser(User user) {
        return given(this.requestSpecification)
                    .body(user)
                .when()
                    .put(USER_ENDPOINT + "/" + user.getUsername())
                    .andReturn;
    }

    public Response getUserByUsername(Sting username) {
        return given(this.requestSpecification)
                .when()
                    .get(USER_ENDPOINT + "/" + usersername())
                    .andReturn;
    }

    public Response deleteUserByUsername(Sting username) {
        return given(this.requestSpecification)
                .when()
                    .delete(USER_ENDPOINT + "/" + usersername())
                    .andReturn;
    }

}
