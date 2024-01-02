package com.example.demo.service;

import com.example.demo.model.Breakfast;
import com.example.demo.model.Dinner;
import org.springframework.stereotype.Service;

@Service
public interface DinnerService {
    public Dinner create(Dinner dinner);
}
