package com.example.Ex31ControllerProtection.repo;

import com.example.Ex31ControllerProtection.entities.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SalaryRepo extends JpaRepository<Salary, Long> {
}
