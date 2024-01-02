package com.example.demo.service.impl;

import com.example.demo.model.Breakfast;
import com.example.demo.repository.BreakfastRepository;
import com.example.demo.service.BreakfastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BreakfastServiceImpl implements BreakfastService {

    @Autowired
    private BreakfastRepository breakfastRepository;
    @Override
    public Breakfast create (Breakfast breakfast){
        return breakfastRepository.save(breakfast);
    }
}
