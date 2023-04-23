package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UserTest {

    private static User user1;
    private static User user2;


    @BeforeAll
    public static void initParam() throws IllegalAccessException {
        System.out.println("Start tasting");
        user1 = new User();
        user2 = new User("login", "myemail@gmail.com");
    }

    @AfterAll
    public static void shouldDoAfterAll() {
        System.out.println("Finish testing");
    }

    @Test
    public void shouldCreateWithParameters(){
        Assertions.assertTrue(user2.getEmail() != null || user2.getLogin() != null);
    }
   @Test
    public void shouldCreateUserWithoutParameters(){
       Assertions.assertTrue(user1.getEmail() == null && user1.getLogin() == null);

   }
   @Test
    public void shouldCreateCorrectUser(){
        Assertions.assertEquals(new User("login","myemail@gmail.com"),user2);
   }
   @Test
    public void shouldNotValidUserParametersTrowException(){
      Assertions.assertThrows (IllegalArgumentException.class, () -> new User("login", "myemail@gmail.com"));
   }










    }
