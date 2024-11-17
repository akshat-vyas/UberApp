package com.Project.uberApp.services.impl;

import com.Project.uberApp.dto.DriverDto;
import com.Project.uberApp.dto.RideDto;
import com.Project.uberApp.dto.RideRequestDto;
import com.Project.uberApp.dto.RiderDto;
import com.Project.uberApp.entities.Rider;
import com.Project.uberApp.entities.User;
import com.Project.uberApp.repositories.RiderRepository;
import com.Project.uberApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RiderServiceImpl implements RiderService {
    private final RiderRepository riderRepository;

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }

    @Override
    public Rider createNewRider(User user) {
        Rider rider = Rider
                .builder()
                .user(user)
                .rating(0.0)
                .build();
        return riderRepository.save(rider);
    }
}
