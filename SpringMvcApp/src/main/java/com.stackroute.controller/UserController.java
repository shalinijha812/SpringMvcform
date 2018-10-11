package com.stackroute.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {

//    @Bean
//    public User user(){
//        User user=new User();
//        user.username="bean name";
//        return user;
//    }
//
    @ModelAttribute("user")
    public User setUsername(){

        return new User();
    }
    public String getUserObject(@ModelAttribute("user") User user, Model model)
    {


//        ApplicationContext user=new AnnotationConfigApplicationContext(User.class) ;
//        User user1=user.getBean(User.class);
//        user1.setUsername("Shalini");
//       map.addAttribute("user",user1.getUsername());
        user.setUsername("asdf");
        return "index";
    }

}
