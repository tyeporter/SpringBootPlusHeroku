package com.tyeporter.springbootplusheroku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class MainController {

    @GetMapping("/")
    public String getHome() {
        return "index.html";
    }

    @GetMapping("/sign-up")
    public String getSignUp() {
        return "sign_up";
    }

    @PostMapping("/")
    public String pickedLogin(@ModelAttribute("choice") String choice) {
        String redirect = "redirect:/";

        if (choice.equals("SignUp")) redirect = "redirect:/sign-up";

        return redirect;
    }
    
}
