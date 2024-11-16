package com.Project.uberApp.strategies;

import com.Project.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare (RideRequestDto rideRequestDto);
}
