package com.example.userms.controller;


import com.example.userms.exceptions.UserNotFoundException;
import com.example.userms.model.User;
import com.example.userms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/", ""})
    public ResponseEntity<List<User>> get() {
        log.trace("Entered:: get()");
        return new ResponseEntity<>(userService.get(), HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> get(@PathVariable("userId")String userId) throws UserNotFoundException {
        log.trace("Entered:: get(String userId)");
        log.info("get(String userId):: Params:: {}", userId);
        return new ResponseEntity<>(userService.get(userId), HttpStatus.OK);
    }

}
