package com.Project.uberApp.strategies.impl;

import com.Project.uberApp.entities.Driver;
import com.Project.uberApp.entities.Payment;
import com.Project.uberApp.entities.enums.PaymentStatus;
import com.Project.uberApp.entities.enums.TransactionMethod;
import com.Project.uberApp.repositories.PaymentRepository;
import com.Project.uberApp.services.WalletService;
import com.Project.uberApp.strategies.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class CashPaymentStrategy implements PaymentStrategy {

    private final WalletService walletService;
    private final PaymentRepository paymentRepository;

    @Override
    public void processPayment(Payment payment) {
        Driver driver = payment.getRide().getDriver();

        double platformCommission = payment.getAmount() * PLATFORM_COMMISSION;

        walletService.deductMoneyFromWallet(driver.getUser(),platformCommission,null ,
                payment.getRide(), TransactionMethod.RIDE);

        payment.setPaymentStatus(PaymentStatus.CONFIRMED);
        paymentRepository.save(payment);
    }
}
