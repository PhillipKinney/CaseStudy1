package com.blogcasestudy1.blogcasestudy2.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;

    private String name;
    private String email;
    private String password;
}
