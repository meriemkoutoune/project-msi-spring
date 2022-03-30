package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    static final int MAX_USER_IN_PAGR = 5;
    @Autowired
    UserRepository userRepository;
    public List<User> getUsers(int page){
        return userRepository.findAll(PageRequest.of(page, MAX_USER_IN_PAGR)).getContent();
    }

    public User addUser(User user){
        return userRepository.save(user);
    }
}
