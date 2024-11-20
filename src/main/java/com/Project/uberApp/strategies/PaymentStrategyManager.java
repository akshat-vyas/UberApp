package com.Project.uberApp.strategies;

import com.Project.uberApp.entities.enums.PaymentMethod;
import com.Project.uberApp.strategies.impl.CashPaymentStrategy;
import com.Project.uberApp.strategies.impl.WalletPaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static com.Project.uberApp.entities.enums.PaymentMethod.CASH;
import static com.Project.uberApp.entities.enums.PaymentMethod.WALLET;


@Component
@RequiredArgsConstructor
public class PaymentStrategyManager {
    private final CashPaymentStrategy cashPaymentStrategy;
    private final WalletPaymentStrategy walletPaymentStrategy;

    public PaymentStrategy paymentStrategy(PaymentMethod paymentMethod){
        return switch (paymentMethod){
            case WALLET -> walletPaymentStrategy;
            case CASH -> cashPaymentStrategy;
        };
    }
}
