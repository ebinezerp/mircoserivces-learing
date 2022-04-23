package com.example.userms.model;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class ExceptionResponse {

    private LocalDateTime timestamp;
    private HttpStatus status;
    private String message;

    private ExceptionResponse(){
        this.timestamp = LocalDateTime.now();
    }

    public ExceptionResponse(HttpStatus status, String message){
        this();
        this.status = status;
        this.message = message;
    }



}
