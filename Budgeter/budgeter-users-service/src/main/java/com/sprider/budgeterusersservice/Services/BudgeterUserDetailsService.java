package com.sprider.budgeterusersservice.Services;

import com.sprider.budgeterusersservice.Model.User;
import com.sprider.budgeterusersservice.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service //means it that this class is embedded in another file (security config file)
public class BudgeterUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(userName);

        if(user == null){throw new UsernameNotFoundException("User does not exist!");}

        return new MyPrincipleUser(user);
        // List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("user"));
        // return new User(user.getUserName(), user.getPassword(), authorities);
    
    }
}

