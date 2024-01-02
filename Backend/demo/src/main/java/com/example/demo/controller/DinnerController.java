package com.example.demo.controller;


import com.example.demo.model.Dinner;
import com.example.demo.service.DinnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dinners")
public class DinnerController {
    @Autowired
    DinnerService breakfastService;
    @GetMapping("/")
    public String dinner(){
        return "dinner";
    }
    @PostMapping("/dinner")
    public String dinnerRegistration(@ModelAttribute Dinner dinner){

        return "redirect:/";
    }
}
