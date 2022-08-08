package com.example.homework_adv_17.dao;

import com.example.homework_adv_17.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentDao extends JpaRepository<Student, Integer> {
    Optional<Student> findById(int id);
}
