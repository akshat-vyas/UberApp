package com.Project.uberApp.strategies;

import com.Project.uberApp.entities.Payment;

public interface PaymentStrategy {

    Double PLATFORM_COMMISSION = 0.3;
    void processPayment ( Payment payment);
}
