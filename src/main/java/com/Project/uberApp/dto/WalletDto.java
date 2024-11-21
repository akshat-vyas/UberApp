package com.Project.uberApp.dto;


import lombok.Data;

import java.util.List;

@Data
public class WalletDto {

    private Long id;

    private UserDto user;

    private double balance;

    private List<WalletTransactionDto> transactions;
}
