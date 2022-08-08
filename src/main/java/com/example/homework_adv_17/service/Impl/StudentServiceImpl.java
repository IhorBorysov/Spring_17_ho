package com.example.homework_adv_17.service.Impl;

import com.example.homework_adv_17.dao.StudentDao;
import com.example.homework_adv_17.entities.Student;
import com.example.homework_adv_17.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getAll() {
        List<Student> all = studentDao.findAll();
        return all;
    }

    @Override
    public Student saveDB(Student student) {
        Student saved = studentDao.save(student);
        return saved;
    }

    @Override
    public Student getById(int id) {
        return studentDao.findById(id).orElse(new Student());
    }

    @Override
    public Student updateDB(Student student) {
        return studentDao.save(student);
    }

    @Override
    public void deleteById(int id) {
        studentDao.deleteById(id);
    }

}
