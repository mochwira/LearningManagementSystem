/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mocha
 */
@Repository
public interface UserRepository extends CrudRepository<User, String>{
   @Query(value = "SELECT * FROM user WHERE email = :email", nativeQuery = true)
    public User getEmail(@Param("email") String email);
  
   @Query(value = "SELECT user.password from user WHERE password = :password", nativeQuery = true)
    public User getPassword(@Param("password") String password);
}
