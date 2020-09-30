package com.example.demo.lang.impl;

import com.example.demo.lang.Language;

public class Vietnamese  implements Language {
    @Override
    public String getGreeting() {
        return "Xin chao";
    }

    @Override
    public String getBye() {
        return "Tam biet";
    }
}
