package com.example.demo.repository;



import com.example.demo.model.Number;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberRepository extends JpaRepository<Number, Long> {
}
