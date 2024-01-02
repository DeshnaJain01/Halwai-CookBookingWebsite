package com.example.demo.service;

import com.example.demo.model.Breakfast;
import com.example.demo.model.Lunch;
import org.springframework.stereotype.Service;

@Service
public interface LunchService {
    public Lunch create(Lunch lunch);
}
