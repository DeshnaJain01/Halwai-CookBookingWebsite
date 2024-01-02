package com.example.demo.repository;

import com.example.demo.model.Lunch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LunchRepository extends JpaRepository<Lunch, String> {
}
