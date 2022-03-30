package com.example.demo.services;

import com.example.demo.entities.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.Assertions;

import java.util.List;


@SpringBootTest
public class UserServiceTest {
    @MockBean
    UserService userService;

    @Test
    void getUsers(){
        List<User> users = userService.getUsers(0);
        Assertions.assertNotNull(users);
    }
}
