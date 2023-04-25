package com.example;

import java.util.Objects;

public class User {
    private int id;
    private String login;
    private String email;
    private String name;

    private static String char1 = "@";
    private static String char2 = ".";

    public User(){

    }
    public User(String Name){
        this.name = getName();
    }

    public User (String login, String email, String name){
        validateUserParameters(login, email);
        this.login = login;
        this.email = email;
        this.name = name;
    }

    private void validateUserParameters(String login, String email) {
        validateLogin(login);
        validateEmail(email);
        if(login.equals(email)){
            throw new IllegalArgumentException("Email is the same as login");
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login){
        validateLogin(login);
        this.login = login;
    }
    private void validateLogin(String login){
        if(login==null){
            throw new IllegalArgumentException("Incorrect email or name");

        }
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        validateEmail(email);
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void validateEmail(String email) {
        if (!email.contains(char1)||!email.contains(char2)){
            throw new IllegalArgumentException("Incorrect email");
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email)&&Objects.equals(id, user.id)&&Objects.equals(name,user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,login, email,name);
    }


}









