package com.Project.uberApp.services;

import com.Project.uberApp.entities.RideRequest;

public interface RideRequestService {
    RideRequest findRideRequestById(Long rideRequestId);
    void update (RideRequest rideRequest);
}
