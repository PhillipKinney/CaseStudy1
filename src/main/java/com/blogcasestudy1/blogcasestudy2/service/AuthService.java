package com.blogcasestudy1.blogcasestudy2.service;

import com.blogcasestudy1.blogcasestudy2.dto.RegisterRequest;
import com.blogcasestudy1.blogcasestudy2.models.User;

public class AuthService {

    public void register(RegisterRequest registerRequest){
        User user = new User();
        user.setName(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
    }
}
