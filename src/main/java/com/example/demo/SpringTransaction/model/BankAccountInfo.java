package com.example.demo.SpringTransaction.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountInfo {
    private Long id;
    private String fullName;
    private double balance;
}
