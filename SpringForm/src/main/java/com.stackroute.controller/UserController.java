package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

//    @ModelAttribute("user")
//    public User setUpUserForm() {
//        return new User();
//    }
    @GetMapping("/")
    public String registration() {

        return "registerationform";
    }
    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user, Model model) {

        // Implement business logic to save user details into a database
        //.....



        System.out.println("Username : " + user.getUsername());
        System.out.println("Password : " + user.getPassword());


        model.addAttribute("message", "User saved successfully.");

        return "registerationsucces";

}
}
