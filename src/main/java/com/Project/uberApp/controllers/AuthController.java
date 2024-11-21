package com.Project.uberApp.controllers;

import com.Project.uberApp.dto.DriverDto;
import com.Project.uberApp.dto.OnBoardDriverDto;
import com.Project.uberApp.dto.SignupDto;
import com.Project.uberApp.dto.UserDto;
import com.Project.uberApp.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    UserDto singUp(@RequestBody SignupDto signupDto){
        return authService.signup(signupDto);
    }

    @PostMapping("/onBoardNewDriver/{userId}")
    ResponseEntity<DriverDto> onBoardNewDriver(@PathVariable Long userId, @RequestBody OnBoardDriverDto onBoardDriverDto){
        return new ResponseEntity<>(authService.onboardNewDriver(userId,
                onBoardDriverDto.getVehicleId()), HttpStatus.CREATED);
    }


}
