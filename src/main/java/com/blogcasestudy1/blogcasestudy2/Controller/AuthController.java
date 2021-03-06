package com.blogcasestudy1.blogcasestudy2.Controller;

import com.blogcasestudy1.blogcasestudy2.dto.LoginRequest;
import com.blogcasestudy1.blogcasestudy2.dto.RegisterRequest;
import com.blogcasestudy1.blogcasestudy2.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;

    @Autowired
    public  AuthController(AuthService authService){
        this.authService = authService;
    }


    @PostMapping("/register")
    public ResponseEntity register(@RequestBody RegisterRequest registerRequest){
     authService.register(registerRequest);
     return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/login")
    public void login(@RequestBody LoginRequest loginRequest){
        authService.login(loginRequest);
    }

}
