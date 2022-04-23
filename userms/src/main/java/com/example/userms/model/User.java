package com.example.userms.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    private String userId;

    @Column(name = "username", nullable = false, unique = true)
    private String username;
    @Column(name = "firstname", nullable = false)
    private String firstname;
    @Column(name = "lastname", nullable = false)
    private String lastname;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "mobile", nullable = false, unique = true)
    private String mobile;
    @Column(name = "is_enable", nullable = false)
    private boolean isEnable;


}
