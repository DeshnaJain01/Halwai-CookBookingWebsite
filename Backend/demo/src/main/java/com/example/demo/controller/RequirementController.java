package com.example.demo.controller;


import com.example.demo.model.Requirement;
import com.example.demo.service.RequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requirements")
public class RequirementController {
    @Autowired
    RequirementService requirementService;
    @GetMapping("/")
    public String requirement(){
        return "requirement";
    }
    @PostMapping("/requirement")
    public String requirementRegistration(@ModelAttribute Requirement requirement){
        return "redirect:/";
    }
}
