package com.example.demo.App.lang.impl;

import com.example.demo.App.lang.Language;

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
