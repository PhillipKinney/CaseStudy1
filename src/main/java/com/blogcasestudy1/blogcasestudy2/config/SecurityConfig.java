package com.blogcasestudy1.blogcasestudy2.config;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {

            httpSecurity.csrf().disable().authorizeRequests()
                    .antMatchers("/api/auth/*")
                   .permitAll()
                   .anyRequest()
                  .authenticated();
    }
}
