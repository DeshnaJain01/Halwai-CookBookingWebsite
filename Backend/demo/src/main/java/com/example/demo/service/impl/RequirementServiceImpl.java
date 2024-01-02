package com.example.demo.service.impl;

import com.example.demo.model.Requirement;
import com.example.demo.repository.RequirementRepository;
import com.example.demo.service.RequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequirementServiceImpl implements RequirementService {
    @Autowired
    private RequirementRepository requirementRepository;

    @Override
    public Requirement create(Requirement requirement){
        return requirementRepository.save(requirement);
    }
}
