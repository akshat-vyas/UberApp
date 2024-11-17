package com.Project.uberApp.services;

import com.Project.uberApp.dto.DriverDto;
import com.Project.uberApp.dto.RideDto;
import com.Project.uberApp.dto.RideRequestDto;
import com.Project.uberApp.dto.RiderDto;
import com.Project.uberApp.entities.Rider;
import com.Project.uberApp.entities.User;

import java.util.List;

public interface RiderService {
    RideRequestDto requestRide (RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();

    Rider createNewRider(User user);
}
