package com.Project.uberApp.services;

import com.Project.uberApp.dto.DriverDto;
import com.Project.uberApp.dto.RiderDto;
import com.Project.uberApp.entities.Ride;

public interface RatingService {
    DriverDto rateDriver(Ride ride , Integer rating);
    RiderDto rateRider(Ride ride , Integer rating);

    void createNewRating(Ride ride);
}
