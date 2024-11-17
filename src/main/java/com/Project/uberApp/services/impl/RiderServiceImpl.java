package com.Project.uberApp.services.impl;

import com.Project.uberApp.dto.DriverDto;
import com.Project.uberApp.dto.RideDto;
import com.Project.uberApp.dto.RideRequestDto;
import com.Project.uberApp.dto.RiderDto;
import com.Project.uberApp.entities.RideRequest;
import com.Project.uberApp.entities.Rider;
import com.Project.uberApp.entities.User;
import com.Project.uberApp.entities.enums.RideRequestStatus;
import com.Project.uberApp.repositories.RideRequestRepository;
import com.Project.uberApp.repositories.RiderRepository;
import com.Project.uberApp.services.RiderService;
import com.Project.uberApp.strategies.DriverMatchingStrategy;
import com.Project.uberApp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class RiderServiceImpl implements RiderService {
    private final RiderRepository riderRepository;
    private final RideRequestRepository rideRequestRepository;
    private final ModelMapper modelMapper;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;


    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        RideRequest rideRequest = modelMapper.map(rideRequestDto,RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);
        Double fare= rideFareCalculationStrategy.calculateFare(rideRequest);

        rideRequest.setFare(fare);
        RideRequest savedRideRequest = rideRequestRepository.save(rideRequest);
        driverMatchingStrategy.findMatchingDriver(rideRequest);
        return modelMapper.map(savedRideRequest,RideRequestDto.class);

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
