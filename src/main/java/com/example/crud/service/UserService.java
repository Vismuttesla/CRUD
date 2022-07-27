package com.example.crud.service;

import com.example.crud.entity.User;
import com.example.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired private UserRepository userRepository;

    public List<User> listAll()
    {
        return (List<User>)  userRepository.findAll();
    }
}
