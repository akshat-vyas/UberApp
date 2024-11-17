package com.Project.uberApp.strategies.impl;
import com.Project.uberApp.entities.Driver;
import com.Project.uberApp.entities.RideRequest;
import com.Project.uberApp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return List.of();
    }
}
