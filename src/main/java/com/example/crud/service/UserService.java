package com.example.crud.service;

import com.example.crud.entity.User;
import com.example.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired private UserRepository userRepository;

    public List<User> listAll()
    {
        return (List<User>)  userRepository.findAll();
    }

    public void save(User user)
    {
        userRepository.save(user);

    }
    public User get(Integer id)
    {

      Optional<User> user = userRepository.findById(id);
           return  user;
    }



}
