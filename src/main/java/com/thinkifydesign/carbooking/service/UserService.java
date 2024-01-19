package com.thinkifydesign.carbooking.service;

import com.thinkifydesign.carbooking.model.User;
import com.thinkifydesign.carbooking.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    public void addUser(String name, String gender, int age) {
        userRepository.addUser(new User(name, gender, age));
    }

    public User findUserByName(String userName) {
        return userRepository.findUserByName(userName);
    }
}
