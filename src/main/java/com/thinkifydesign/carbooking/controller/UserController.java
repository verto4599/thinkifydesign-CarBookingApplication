package com.thinkifydesign.carbooking.controller;
import com.thinkifydesign.carbooking.service.UserService;
import com.thinkifydesign.carbooking.model.User;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser(String name, String gender, int age) {
        userService.addUser(name, gender, age);
    }

    public User findUserByName(String userName) {
        return userService.findUserByName(userName);
    }
}
