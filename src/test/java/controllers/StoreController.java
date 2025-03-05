package controllers;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static constants.CommonConstants.BASE_URI;

public class StoreController {
    RequestSpecification requestSpecification;

    private static final String USER_ENDPOINT = "store";

    public StoreController() {
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
