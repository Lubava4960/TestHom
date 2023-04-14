package com.example;

public class User {
    private static String login;
    private static String email;

    public  User(String login, String email) {
        this.login = login;

        boolean inEmail;
        if (inEmail = email.contains("@")&&email.contains(".")) {
            System.out.println("email ok");
            this.email = email;
        } else {
            System.out.println("Error");
        }
    }


    public void getUser(String login, String email){

      }


    public static String getLogin() {
        return login;
    }

    public static String getEmail() {
        return email;
    }

}
