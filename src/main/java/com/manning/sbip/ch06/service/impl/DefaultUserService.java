package com.manning.sbip.ch06.service.impl;

import com.manning.sbip.ch06.dto.UserDto;
import com.manning.sbip.ch06.model.ApplicationUser;
import com.manning.sbip.ch06.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class DefaultUserService implements UserRepository {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public ApplicationUser createUser(UserDto userDto) {
        ApplicationUser applicationUser = new ApplicationUser();
        applicationUser.setFirstName(userDto.getFirstName());
        applicationUser.setLastName(userDto.getLastName());
        applicationUser.setEmail(userDto.getEmail());
        applicationUser.setUsername(userDto.getUsername());
        applicationUser.setPassword(passwordEncoder.encode(userDto.getPassword()));

        return userRepository.save(applicationUser);
    }

    public ApplicationUser findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
