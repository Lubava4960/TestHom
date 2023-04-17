package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



class UserTest {
    private static String login;
    private static String email;
    static User user;
    @BeforeAll
    private static void initParam(){
        System.out.println("Start tasting");
        String login = "login";
        String email = "@email.ru";
        user = new User(login, email);
    }
    @AfterAll
    private static void shouldDoAfterAll(){
        System.out.println("Finish testing");
    }
    @Test
    void shouldGetLogin() {
    Assertions.assertEquals("login",user.getLogin());
    }

    @Test
    void shouldGetEmail() {
        Assertions.assertEquals("@email.ru",user.getEmail());
    }


}