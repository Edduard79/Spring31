package com.example.Ex31ControllerProtection.repo;

import com.example.Ex31ControllerProtection.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
