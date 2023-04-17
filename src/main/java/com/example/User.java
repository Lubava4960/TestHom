package com.example;

public class User {
    private static String login;
    private static String email;

    public  User(String login, String email) {
        this.login = login;
        this.email = email;
    }


        public Object getLogin() {

            if (login == login.toString()) {
                System.out.println("login ok");
                this.login = login;
            } else {
                System.out.println("Error");
            }

            return null;
        }
        public Object getEmail() {
            boolean inEmail;
            if (inEmail = email.contains("@")&& email.contains(".") ) {
                System.out.println("email ok");
                this.email = "@email.ru";
            } else {
                System.out.println("Error");
            }

            return null;
        }




    }





