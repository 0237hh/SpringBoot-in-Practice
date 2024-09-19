package com.manning.sbip.ch06.service;

import com.manning.sbip.ch06.dto.UserDto;
import com.manning.sbip.ch06.model.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository {
    ApplicationUser createUser(UserDto userDto);
    ApplicationUser findByUsername(String username);
}
