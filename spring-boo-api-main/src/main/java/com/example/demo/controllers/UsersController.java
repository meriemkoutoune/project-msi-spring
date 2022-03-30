package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;
import com.example.demo.validations.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UserService userService;
    @GetMapping("/users")
    public List<User> getAll(@RequestParam(name = "p",defaultValue = "0") int page){
        return userService.getUsers(page);
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
