package com.example.homework_adv_17.service;

import com.example.homework_adv_17.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student saveDB(Student student);
    Student getById(int id);
    Student updateDB(Student student);
    void deleteById(int id);
}
