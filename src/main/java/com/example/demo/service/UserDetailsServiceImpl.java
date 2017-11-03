package com.example.demo.service;

import com.example.demo.domain.MyUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        if (s.equals("admin")){
            MyUserDetails myUserDetails = new MyUserDetails();
            myUserDetails.setUsername("admin");
            myUserDetails.setPassword("$2a$10$BVtCXUEH5X78/OlnMQrvFu1iQkjhConGmDf.9PRBRVuLUEVGBA8o6");
            return myUserDetails;
        }
        return null;
    }
}
