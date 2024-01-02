package com.example.demo.controller;


import com.example.demo.model.Breakfast;
import com.example.demo.service.BreakfastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/breakfasts")
public class BreakfastController {


        @Autowired
        BreakfastService numberService;
        @GetMapping("/")
        public String breakfast(){
            return "breakfast";
        }
        @PostMapping("/breakfast")
        public String breakfastRegistration(@ModelAttribute Breakfast breakfast){

            return "redirect:/";
        }
    }



