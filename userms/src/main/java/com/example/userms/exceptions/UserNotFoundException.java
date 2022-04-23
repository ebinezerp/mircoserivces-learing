package com.example.userms.exceptions;

public class UserNotFoundException extends Exception {

    private String username;
    public UserNotFoundException(String username) {
        this.username = username;
    }

    @Override
    public String getMessage() {
        return "UserNotFoundException:: "+ username;
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
