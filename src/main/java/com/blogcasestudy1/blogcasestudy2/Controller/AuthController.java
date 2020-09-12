package com.blogcasestudy1.blogcasestudy2.Controller;

import com.blogcasestudy1.blogcasestudy2.dto.RegisterRequest;
import com.blogcasestudy1.blogcasestudy2.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest registerRequest){

    }


}
