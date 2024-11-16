package com.Project.uberApp.services.impl;

import com.Project.uberApp.dto.DriverDto;
import com.Project.uberApp.dto.SignupDto;
import com.Project.uberApp.dto.UserDto;
import com.Project.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
