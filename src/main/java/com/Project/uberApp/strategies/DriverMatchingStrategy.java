package com.Project.uberApp.strategies;
import com.Project.uberApp.entities.Driver;
import com.Project.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver (RideRequest rideRequest);
}
