package com.example.demo.repository;

import com.example.demo.model.Requirement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequirementRepository extends JpaRepository<Requirement, String> {
}
