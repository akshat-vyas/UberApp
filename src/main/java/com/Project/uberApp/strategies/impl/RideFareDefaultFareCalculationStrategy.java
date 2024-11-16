package com.Project.uberApp.strategies.impl;

import com.Project.uberApp.dto.RideRequestDto;
import com.Project.uberApp.strategies.RideFareCalculationStrategy;

public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
