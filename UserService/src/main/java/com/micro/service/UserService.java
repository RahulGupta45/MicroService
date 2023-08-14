package com.micro.service;

import com.micro.entities.User;

import java.util.List;


public interface UserService {

    User saveUser(User user);

    User getUser(String userId);

    List<User> getAllUser();

    void deleteUser(String userId);

    User updateUser(User user);

}
