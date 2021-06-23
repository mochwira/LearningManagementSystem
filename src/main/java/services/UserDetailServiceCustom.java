/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.NewUserDetail;
import entity.Role;
import entity.User;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author mocha
 */
public class UserDetailServiceCustom implements UserDetailsService{

    @Autowired
    private UserService uService;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = uService.getEmail(username);
        
        String email = user.getEmail();
        String password = user.getPassword();
        //role belum bener
        String role = user.getRoleId().getNamaRole();
        
        return new NewUserDetail(email, password, role);
        
    }
    
}
