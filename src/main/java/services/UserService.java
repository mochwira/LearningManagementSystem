/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.User;
import interfaces.UserInterface;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

/**
 *
 * @author mocha
 */
@Service
public class UserService implements UserInterface{

    @Autowired
    private UserRepository userRepo;
    
    @Override
    public User getEmail(String email) {
        return userRepo.getEmail(email);
    }

    @Override
    public User getPassword(String password) {
        return userRepo.getPassword(password);
    }
    
}
