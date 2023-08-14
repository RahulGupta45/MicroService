package com.micro.service;

import com.micro.entities.User;
import com.micro.exceptions.ResourceNotFoundException;
import com.micro.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        String userId = UUID.randomUUID().toString();
        user.setUserId(userId);
        return userRepo.save(user);
    }

    @Override
    public User getUser(String userId) {
        return userRepo.findById(userId).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public void deleteUser(String userId) {
        userRepo.deleteById(userId);
    }

    @Override
    public User updateUser(User user) {
        return userRepo.save(user);
    }
}
