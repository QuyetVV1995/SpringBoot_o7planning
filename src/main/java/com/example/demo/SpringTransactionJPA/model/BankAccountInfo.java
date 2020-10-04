package com.example.demo.SpringTransactionJPA.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
/* Model đại diện cho dữ liệu của 1 bản ghi của một câu lệnh truy vấn  */
public class BankAccountInfo {
    private Long id;
    private String fullName;
    private double balance;
}
