package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin

public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getusers")
    public List<UserDTO> getUser(){
        return userService.getUser();
    }

    @PostMapping("/saveuser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateuser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteuser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }

    @GetMapping("/getUserByUserId/{userId}")
    public UserDTO getUserByUserId(@PathVariable String userId){
        return userService.getUserByUserId(userId);
    }


}
