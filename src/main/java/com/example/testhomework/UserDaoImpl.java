package com.example.testhomework;

import com.example.User;

import java.util.Arrays;
import java.util.List;


public class UserDaoImpl implements UserDao {
    private final List<User> users;




    public UserDaoImpl() {

        this.users = Arrays.asList(
                new User("Marie","marie@gmail.com","Marie"),
                new User ("Alex","alex22@gmail.com","Alex")
        );
    }


    @Override
    public User getUserByName(String name) {
        for(User user:users)
            if (user.getName().equals(name)) {
                return user;
            }

        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}
