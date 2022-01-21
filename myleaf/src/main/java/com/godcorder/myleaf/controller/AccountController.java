package com.godcorder.myleaf.controller;


import com.godcorder.myleaf.model.Users;
import com.godcorder.myleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/account")
public class AccountController {


    @Autowired
   private UserService userService;


    @GetMapping("/login")
    public String login(){

        return "account/login";
    }


    @PostMapping("/register")
    public String register(Users users){

         userService.save(users);

        return "redirect:/";
    }

    @GetMapping("/register")
    public String register(){


        return "account/register";
    }
}
