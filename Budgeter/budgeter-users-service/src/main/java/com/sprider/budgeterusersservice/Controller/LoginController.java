package com.sprider.budgeterusersservice.Controller;

import com.sprider.budgeterusersservice.Model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    
    @GetMapping("/")
    public String getIndex (){
      return "index";
    }

    @GetMapping("/auth")
    public String getauth(Model model){
      model.addAttribute("user", new User());
      return "login";
    }

    @PostMapping("/auth")
    public String authSubmit(@ModelAttribute User user, Model model){
      model.addAttribute("user", user);
      return "index";
        
    }
}
