package com.example.demo.controller;

import com.example.demo.model.Number;
import com.example.demo.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/numbers")
public class NumberController {
    @Autowired
    NumberService numberService;
    @GetMapping("/")
    public String number(){
        return "number";
    }
    @PostMapping("/number")
    public String numberRegistration(@ModelAttribute Number number){
      System.out.println(number.toString());
        return "redirect:/";
    }
    }

