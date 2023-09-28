package com.example.buysell.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UserControllers {
    @GetMapping("/registration")
    public String registration() {
        return "registration";

    }
}
