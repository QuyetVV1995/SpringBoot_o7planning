package com.example.demo.SpringTransactionJPA.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/*Entity là một class đại diện (tương ứng) cho một bảng trong cơ sở dữ liệu.
Các trường (field) trong lớp này sẽ tương ứng với các cột trong bảng.*/
@Entity
@Table(name = "Bank_Account")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Full_Name", length = 128, nullable = false)
    private String fullName;

    @Column(name = "Balance", nullable = false)
    private double balance;
}
