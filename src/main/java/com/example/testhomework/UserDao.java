package com.example.testhomework;

import com.example.User;

import java.util.List;

public interface UserDao {

    User getUserByName(String name);

    List<User> findAllUsers();



}
