package com.manning.sbip.ch06.service.impl;

import com.manning.sbip.ch06.model.ApplicationUser;
import com.manning.sbip.ch06.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ApplicationUser applicationUser = userRepository.findByUsername(username);
        if (applicationUser == null) {
            throw new UsernameNotFoundException("User with username" + username + " does not exists");
        }
        UserDetails userDetails = User.withUsername(username)
                .password(applicationUser.getPassword())
                .roles("USER")
                .disabled(false)
                .build();
        return userDetails;
    }
}
