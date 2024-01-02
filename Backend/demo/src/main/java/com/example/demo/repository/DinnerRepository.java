package com.example.demo.repository;

import com.example.demo.model.Dinner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DinnerRepository extends JpaRepository<Dinner, String> {
}
