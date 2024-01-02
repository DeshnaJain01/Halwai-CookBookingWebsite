package com.example.demo.controller;

import com.example.demo.model.Breakfast;
import com.example.demo.model.Lunch;
import com.example.demo.service.LunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lunches")
public class LunchController {
    @Autowired
    LunchService lunchService;
    @GetMapping("/")
    public String lunch(){
        return "lunch";
    }
    @PostMapping("/lunch")
    public String lunchRegistration(@ModelAttribute Lunch lunch){

        return "redirect:/";
    }
}
