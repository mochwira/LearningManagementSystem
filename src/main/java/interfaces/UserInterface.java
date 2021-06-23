/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.User;
import java.util.Optional;

/**
 *
 * @author mocha
 */
public interface UserInterface {
    
    User getEmail(String email);
    User getPassword(String password);
}
