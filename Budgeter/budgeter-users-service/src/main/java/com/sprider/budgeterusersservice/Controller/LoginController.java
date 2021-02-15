package com.sprider.budgeterusersservice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    
    @GetMapping("/")
    public String getIndex (){
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }
}