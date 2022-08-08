package com.example.homework_adv_17.controllers;

import com.example.homework_adv_17.entities.Student;
import com.example.homework_adv_17.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<Student> getAllStudent(){
        return studentService.getAll();
    }

    @PostMapping
    public Student save(){
        Student student = new Student();
        student.setName("Ihor");
        student.setAge(19);
        return studentService.saveDB(student);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable int id){
        Student student = studentService.getById(id);
        student.setName("Андрій");
        student.setAge(22);
        return studentService.updateDB(student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        studentService.deleteById(id);
    }
}
