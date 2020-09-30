package com.example.demo.App.lang.impl;

import com.example.demo.App.lang.Language;

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
