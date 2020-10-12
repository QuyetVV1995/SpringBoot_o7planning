package com.example.demo.SpringValidator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AppUser {
    private Long userId;
    private String userName;
    private String firstName;
    private String lastName;
    private boolean enable;
    private String gender;
    private String email;
    private String encrytedPassword;
    private String countryCode;

}
