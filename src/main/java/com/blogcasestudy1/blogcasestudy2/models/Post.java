package com.blogcasestudy1.blogcasestudy2.models;


import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String title;

    @Lob
    private String postBody;
    private Instant dateCreated;
    private Instant dateUpdated;
}
