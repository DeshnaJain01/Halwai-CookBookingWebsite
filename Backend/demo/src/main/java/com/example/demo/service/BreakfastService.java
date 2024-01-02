package com.example.demo.service;

import com.example.demo.model.Breakfast;
import org.springframework.stereotype.Service;

@Service
public interface BreakfastService {
    public Breakfast create(Breakfast breakfast);
}
