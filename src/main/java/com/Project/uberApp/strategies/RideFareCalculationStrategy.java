package com.Project.uberApp.strategies;
import com.Project.uberApp.entities.RideRequest;

public interface RideFareCalculationStrategy {
    double RIDE_FARE_MULTIPLIER = 10;

    double calculateFare (RideRequest rideRequest);
}
