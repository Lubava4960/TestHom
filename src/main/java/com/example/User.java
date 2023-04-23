package com.example;

import java.util.Objects;

public class User {
    private int id;
    private String login;
    private String email;
    private static String char1 = "@";
    private static String char2 = ".";

    public User(){

    }
    public User(String login){
        this.login = login;
    }
    public User (String login, String email){
        validateUserParameters(login, email);
        this.login = login;
        this.email = email;
    }

    private void validateUserParameters(String login, String email) {
        validateLogin(login);
        validateEmail(email);
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

    public void validateEmail(String email) {
        if (!email.contains(char1)||!email.contains(char2)){
            throw new IllegalArgumentException("Incorrect email");
        }


    }





    //public User(String login, String email)throws IllegalArgumentException{
   //     if (login.equals(email)){
     //       throw new IllegalArgumentException();
     //   }

    //    this.login = login;


     //   if (Objects.equals(email,String.valueOf(!email.contains("@")|| !email.contains(".")))){

     //       throw new IllegalArgumentException();
     //   }

     //   this.email = email;
   // }



   // public Object argumentUser(String login, String email ) throws IllegalArgumentException {
    //    if (login.equals("")) {
     //       System.out.println((String) null);
      //  }

      //  if (Objects.equals(email, String.valueOf(!email.contains(" ")))) {
     //       System.out.println((String) null);

     //   }


     //   return null;
    //}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email)&&Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,login, email);
    }
}









