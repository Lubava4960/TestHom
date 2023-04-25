package com.example.testhomework;

import com.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    private UserDao dao;
    @InjectMocks
    private UserService userService;

    @Test
    void checkUserExistTrue() {
        when(dao.getUserByName("test")).thenReturn(new User("test"));
        boolean userExist = userService.checkUserExist(
                new User("test"));
        verify(dao, times(1)).getUserByName("test");
        Assertions.assertTrue(userExist);
    }
    @Test
    public void checkIfUserExistsFalse(){
        when(dao.getUserByName("test")).thenReturn(null);
        boolean userExist = userService.checkUserExist(
                new User("test"));
        Assertions.assertFalse(userExist);

    }
}