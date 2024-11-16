package com.Project.uberApp.services;

import com.Project.uberApp.dto.RideRequestDto;
import com.Project.uberApp.entities.Driver;
import com.Project.uberApp.entities.Ride;
import com.Project.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById (Long rideId);

    void matchWithDriver(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider (Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver (Long driverId, PageRequest pageRequest);

}
