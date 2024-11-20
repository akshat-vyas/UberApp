package com.Project.uberApp.services;

import com.Project.uberApp.entities.Ride;
import com.Project.uberApp.entities.User;
import com.Project.uberApp.entities.Wallet;
import com.Project.uberApp.entities.enums.TransactionMethod;

public interface WalletService {

    Wallet addMoneyToWallet (User user, Double amount,
                             String transactionId, Ride ride,
                             TransactionMethod transactionMethod);

    Wallet deductMoneyFromWallet (User user, Double amount,
                             String transactionId, Ride ride,
                             TransactionMethod transactionMethod);

    void withdrawAllMyMoneyFromWallet();

    Wallet findWalletById(Long walletId);

    Wallet createNewWallet(User user);

    Wallet findByUser (User user);


}
