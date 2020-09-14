package com.blogcasestudy1.blogcasestudy2.service;

import com.blogcasestudy1.blogcasestudy2.dto.LoginRequest;
import com.blogcasestudy1.blogcasestudy2.dto.RegisterRequest;
import com.blogcasestudy1.blogcasestudy2.models.User;
import com.blogcasestudy1.blogcasestudy2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    public void register(RegisterRequest registerRequest){
        User user = new User();
        user.setName(registerRequest.getUsername());
        user.setPassword(endcodePassword(registerRequest.getPassword()));
        user.setEmail(registerRequest.getEmail());
        userRepository.save(user);
    }

    private String endcodePassword(String password) {
        return passwordEncoder.encode(password);
    }


    public void login(LoginRequest loginRequest) {

    }
}
