package com.example;

import java.util.Objects;

public class User {
    private String login;
    private String email;
    

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public User(String login, String email) throws IllegalArgumentException {
        if (login.equals(email)) {
            throw new IllegalArgumentException();
        }
        this.login = login;
        if (Objects.equals(email, String.valueOf(!email.contains("@") || !email.contains(".")))) {

            throw new IllegalArgumentException();
        }
        this.email = email;

    }

    public Object argumentUser(String login, String email ) throws IllegalArgumentException {
        if (login == " " || email == " ") {
            System.out.println((java.lang.String) null);
                }else{
                this.login = login;
                this.email = email;
            }
        return null;


    }
    }









