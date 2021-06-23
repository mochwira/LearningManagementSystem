/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mocha
 */
@Controller
@RequestMapping
//@RestController
public class EmployeeController {
    
    @GetMapping("/user")
    public String userEmployee() {

        System.out.println("Hello Employee");
        return "auth/employee_page.html";
        //return ("<h1> Welcome Employee </h1>");
    }
}
