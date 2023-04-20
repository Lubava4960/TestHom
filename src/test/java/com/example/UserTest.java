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
    public static void initParam() throws IllegalAccessException {
        System.out.println("Start tasting");
        String login = "login";
        String email = "myemail@gmail.com";
        user = new User(login, email);
    }

    @AfterAll
    public static void shouldDoAfterAll() {
        System.out.println("Finish testing");
    }

    @Test
    void shouldGetLogin() {
        String login = "login";
        String email = "myemail@gmail.com";
        User user = new User("login", "myemail@gmail.com");
        Assertions.assertEquals("login", user.getLogin());
        Assertions.assertEquals("myemail@gmail.com", user.getEmail());
    }


    @Test
    void shouldGetUser() {
        String login = "login";
        String email = "myemail@gmail.com";
        User user = new User("login", "myemail@gmail.com");

        Assertions.assertEquals("login", user.getLogin());
        Assertions.assertEquals("myemail@gmail.com", user.getEmail());
    }

    @Test
    void shouldArgumentUser(){
        Assertions.assertEquals(null,user.argumentUser(login,email));
    }
    @Test()
    void shouldExceptionUser()throws IllegalArgumentException {
        String login = email;
        Assertions.assertThrows(IllegalArgumentException.class, ()->user.argumentUser("login",  "email"));


    }

}