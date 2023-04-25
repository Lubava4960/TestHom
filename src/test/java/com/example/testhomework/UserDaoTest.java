package com.example.testhomework;

import com.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserDaoTest {

    private final UserDao dao =new UserDaoImpl();


    @Test
    public void testUserByUserName(){
        User user = dao.getUserByName("Marie");
        Assertions.assertNotNull(user);
        Assertions.assertEquals(user.getName(), "Marie");
    }


    @Test
    public void testUserByUserNameIsNull(){
        Assertions.assertNull(dao.getUserByName("person"));
    }

}

