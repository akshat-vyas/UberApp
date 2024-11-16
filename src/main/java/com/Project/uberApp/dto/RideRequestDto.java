package com.Project.uberApp.dto;

import com.Project.uberApp.entities.enums.PaymentMethod;
import com.Project.uberApp.entities.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDto {
    private Long id;

    private Point pickupLocation;
    private Point dropOffLocation;
    private PaymentMethod paymentMethod;

    private LocalDateTime requestedTime;
    private RiderDto rider;
    private RideRequestStatus rideRequestStatus;
}
