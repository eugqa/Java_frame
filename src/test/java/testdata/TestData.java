package testdata;

import models.User;

public class TestData {
    private static final String User DEFAULT_USER = User.builder()
            .username("username")
            .firstName("firstName")
            .lastName("lastName")
            .email("email")
            .password("password")
            .userStatus(0)
            .build();

}
