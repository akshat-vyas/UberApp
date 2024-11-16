package com.Project.uberApp.strategies.impl;

import com.Project.uberApp.dto.RideRequestDto;
import com.Project.uberApp.entities.Driver;
import com.Project.uberApp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
