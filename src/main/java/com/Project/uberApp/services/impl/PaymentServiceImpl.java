package com.Project.uberApp.services.impl;

import com.Project.uberApp.entities.Payment;
import com.Project.uberApp.entities.Ride;
import com.Project.uberApp.entities.enums.PaymentStatus;
import com.Project.uberApp.exceptions.ResourceNotFoundException;
import com.Project.uberApp.repositories.PaymentRepository;
import com.Project.uberApp.services.PaymentService;
import com.Project.uberApp.strategies.PaymentStrategyManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final PaymentStrategyManager paymentStrategyManager;

    @Override
    public void processPayment(Ride ride) {
        Payment payment = paymentRepository.findByRide(ride)
                .orElseThrow(()->new ResourceNotFoundException("Payment not found for ride with id: "+ ride.getId()));
        paymentStrategyManager.paymentStrategy(ride.getPaymentMethod()).processPayment(payment);

    }

    @Override
    public Payment createNewPayment(Ride ride) {
        Payment payment= Payment.builder()
                .ride(ride)
                .paymentMethod(ride.getPaymentMethod())
                .amount(ride.getFare())
                .paymentStatus(PaymentStatus.PENDING)
                .build();
        return paymentRepository.save(payment);
    }

    @Override
    public void updatePaymentStatus(Payment payment, PaymentStatus paymentStatus) {
        payment.setPaymentStatus(paymentStatus);
        paymentRepository.save(payment);
    }
}
