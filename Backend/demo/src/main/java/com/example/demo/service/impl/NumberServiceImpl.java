package com.example.demo.service.impl;

import com.example.demo.model.Number;
import com.example.demo.repository.NumberRepository;
import com.example.demo.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumberServiceImpl implements NumberService {
@Autowired

private NumberRepository numberRepository;

    @Override
    public Number create(Number number) {
        return numberRepository.save(number);
    }
}
