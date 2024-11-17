package com.Project.uberApp.strategies.impl;
import com.Project.uberApp.entities.RideRequest;
import com.Project.uberApp.strategies.RideFareCalculationStrategy;

public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}
