package com.example.userms;

import com.example.userms.exceptions.UserNotFoundException;
import com.example.userms.model.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class UsermsGlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ExceptionResponse handleUserNotFoundException(UserNotFoundException ex) {
        return new ExceptionResponse(HttpStatus.NOT_FOUND, ex.getMessage());
    }

}
