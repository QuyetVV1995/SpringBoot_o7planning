package com.example.demo.lang.impl;

import com.example.demo.lang.Language;

public class English implements Language {
    @Override
    public String getGreeting() {
        return "Hello";
    }

    @Override
    public String getBye() {
        return "Goodbye";
    }
}
