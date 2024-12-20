package com.Project.uberApp.strategies.impl;
import com.Project.uberApp.entities.Driver;
import com.Project.uberApp.entities.RideRequest;
import com.Project.uberApp.repositories.DriverRepository;
import com.Project.uberApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}