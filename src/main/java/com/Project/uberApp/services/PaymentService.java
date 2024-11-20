package com.Project.uberApp.services;

import com.Project.uberApp.entities.Payment;
import com.Project.uberApp.entities.Ride;
import com.Project.uberApp.entities.enums.PaymentStatus;

public interface PaymentService {

    void processPayment(Ride ride);

    Payment createNewPayment(Ride ride);

    void updatePaymentStatus (Payment payment, PaymentStatus paymentStatus);
}
