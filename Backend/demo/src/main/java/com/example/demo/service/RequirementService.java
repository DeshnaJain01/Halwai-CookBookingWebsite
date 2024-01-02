package com.example.demo.service;

import com.example.demo.model.Breakfast;
import com.example.demo.model.Requirement;
import org.springframework.stereotype.Service;

@Service
public interface RequirementService {
    public Requirement create(Requirement requirement);
}
