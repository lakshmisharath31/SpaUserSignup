package org.launchcode.spaday.controllers;


import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {


    @GetMapping("add")
    public String displayAddUserForm(Model model) {
        model.addAttribute(new User());
        return "/user/add";
    }

    @PostMapping()
    public String processAddUserForm(@ModelAttribute @Valid User user, Errors errors,Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("errorMsg","Bad data!");
            return "user/add";
        }
        /*
          model.addAttribute("verify",verify);

        if(user.getPassword().equals(verify)){
            //model.addAttribute("error","Password do not match please try again.");
            //model.addAttribute("username",user.getUsername());
           // model.addAttribute("email",user.getEmail());
            return "user/index";
        }else{
            model.addAttribute("error","password did not match!");

            return "user/add";
            */
        return "user/index";
        }
    }


