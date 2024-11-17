package com.Project.uberApp.controllers;

import com.Project.uberApp.dto.SignupDto;
import com.Project.uberApp.dto.UserDto;
import com.Project.uberApp.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    UserDto singUp(@RequestBody SignupDto signupDto){
        return authService.signup(signupDto);
    }


}