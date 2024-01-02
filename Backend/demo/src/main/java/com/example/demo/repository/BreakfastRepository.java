package com.example.demo.repository;

import com.example.demo.model.Breakfast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreakfastRepository extends JpaRepository<Breakfast, String> {
}
