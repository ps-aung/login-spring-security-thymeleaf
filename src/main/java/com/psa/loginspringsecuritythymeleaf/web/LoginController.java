package com.psa.loginspringsecuritythymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by pyaesoneaung at 10/05/2021
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
