package com.blogcasestudy1.blogcasestudy2.service;

import com.blogcasestudy1.blogcasestudy2.models.User;
import com.blogcasestudy1.blogcasestudy2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    @Autowired
    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user = userRepository.findbyUserName(username).orElseThrow(()->
                new UsernameNotFoundException("User not found" + username));
        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), true,true, true, true,
                getAuthorities("ROLE_uSER"));
        
    }

    private Collection<? extends GrantedAuthority> getAuthorities(String role_uSER) {
        return Collections.singletonList(new SimpleGrantedAuthority(role_uSER));
    }
}
