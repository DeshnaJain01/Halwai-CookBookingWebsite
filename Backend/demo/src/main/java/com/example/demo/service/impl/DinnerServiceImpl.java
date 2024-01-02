package com.example.demo.service.impl;

import com.example.demo.model.Dinner;
import com.example.demo.model.Number;
import com.example.demo.repository.DinnerRepository;
import com.example.demo.service.DinnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DinnerServiceImpl implements DinnerService {
    @Autowired

    private DinnerRepository dinnerRepository;

    @Override
    public Dinner create(Dinner dinner) {
        return dinnerRepository.save(dinner);
    }
}
