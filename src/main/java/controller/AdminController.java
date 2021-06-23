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
public class AdminController {
    @GetMapping("/admin")
    public String AdminHome() {

        System.out.println("Hello Admin");
        return "auth/admin_page.html";
        //return ("<h1> Welcome Admin </h1>");
    }
}
