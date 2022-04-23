package com.example.userms.service;

import com.example.userms.exceptions.UserNotFoundException;
import com.example.userms.model.User;

import java.util.List;

public interface UserService {
    User get(String username) throws UserNotFoundException;
    List<User> get();
}
