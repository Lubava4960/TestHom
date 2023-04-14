package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private static String login = "login";
    private static String email = "@email.ru";

    User user = new User(login, email);


    @Test
    private static void initParam() {
        login = "login";
        email = "@email.ru";

    }

    @Test
    void shouldGetUser() {
    }


    @Test
    void getLogin() {
    }

    @Test
    void getEmail() {
    }
}