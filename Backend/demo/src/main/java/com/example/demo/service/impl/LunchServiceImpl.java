package com.example.demo.service.impl;

import com.example.demo.model.Lunch;
import com.example.demo.repository.LunchRepository;
import com.example.demo.service.LunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LunchServiceImpl implements LunchService {
    @Autowired
    private LunchRepository lunchRepository;
    @Override
    public Lunch create(Lunch lunch){
        return lunchRepository.save(lunch);
    }
}
