package com.Project.uberApp.services;

import com.Project.uberApp.dto.DriverDto;
import com.Project.uberApp.dto.SignupDto;
import com.Project.uberApp.dto.UserDto;

public interface AuthService {
    String login(String email, String password);
    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId, String vehicleId);
}
