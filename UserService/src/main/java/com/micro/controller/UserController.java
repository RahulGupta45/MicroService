package com.micro.controller;

import com.micro.entities.User;
import com.micro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping("/get/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){
        User user = userService.getUser(userId);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @RequestMapping("/all")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> userList = userService.getAllUser();
        return ResponseEntity.ok(userList);
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        User user1 = userService.updateUser(user);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(user1);
    }

    @DeleteMapping("/delete/{deleteId}")
    public ResponseEntity deleteUser(@PathVariable String deleteId){
        userService.deleteUser(deleteId);
        return  new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
