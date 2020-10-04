package com.example.demo.SpringTransactionJPA.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SendMoneyForm {
    private Long fromAccountId;
    private Long toAccountId;
    private Double amount;
}
