package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;




class UserTest {
    private static String login;
    private static String email;
    static User user;
    @BeforeAll
    public static void initParam() throws IllegalAccessException {
        System.out.println("Start tasting");
        String login = "login";
        String email = "@email.ru";
        user = new User(login, email);
    }
    @AfterAll
    public static void shouldDoAfterAll(){
        System.out.println("Finish testing");
    }




}