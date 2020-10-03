package com.example.demo.sbi18n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = {"/","/login1"})
    public String staticResource(Model model) {
        return "/Thymeleaf/login1";
    }
}
