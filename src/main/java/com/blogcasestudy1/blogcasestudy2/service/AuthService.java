package com.blogcasestudy1.blogcasestudy2.service;

import com.blogcasestudy1.blogcasestudy2.dto.RegisterRequest;
import com.blogcasestudy1.blogcasestudy2.models.User;
import com.blogcasestudy1.blogcasestudy2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private UserRepository userRepository;

    @Autowired
    public AuthService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void register(RegisterRequest registerRequest){
        User user = new User();
        user.setName(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
        userRepository.save(user);
    }
}
