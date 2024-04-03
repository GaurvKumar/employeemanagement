package com.employeemanagement.service;

import com.employeemanagement.dto.UserRegistrationDto;
import com.employeemanagement.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
