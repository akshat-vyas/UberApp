package com.Project.uberApp.services.impl;

import com.Project.uberApp.dto.DriverDto;
import com.Project.uberApp.dto.RideDto;
import com.Project.uberApp.dto.RideRequestDto;
import com.Project.uberApp.dto.RiderDto;
import com.Project.uberApp.services.RiderService;

import java.util.List;

public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
