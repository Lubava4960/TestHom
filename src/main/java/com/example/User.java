package com.example;

import java.util.Objects;

public class User {
    private final String login;
    private final String  email;


    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public User(String login, String email) throws IllegalAccessException {
        if (login.equals(email)) {
            throw new IllegalAccessException();
        }
        this.login = login;

        if (Objects.equals(email, String.valueOf(email.contains("@") && email.contains(".")))) {

            throw new IllegalAccessException();
        }
        this.email = email;

    }
}






