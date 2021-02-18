package com.sprider.budgeterusersservice.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
       
    @Override //allows configuring the filterchain!?
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/", "/home").permitAll() // All requests going the specified are allowed (permitted) - the user does not have to authenticate. You are using an antMatcher, which means you could have also used wildcards (*, \*\*, ?) in the string.
            .anyRequest().authenticated() //Any other request needs the user to be authenticated with login
                .and()
            .formLogin()
            .loginPage("/auth") //using a custom login form instead of spring security generated
            .permitAll() // permits anyone to access this page, otherwise error equals a 'Catch-22'
                .and()
            .logout() 
            .permitAll()
                .and()
            .httpBasic();
    }

}
