package com.sprider.budgeterusersservice.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    
    public void addViewConfiguration (ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/auth").setViewName("login");
    }
}
