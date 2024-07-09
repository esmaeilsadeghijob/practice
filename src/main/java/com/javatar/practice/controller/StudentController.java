package com.javatar.practice.controller;

import com.javatar.practice.model.Student;
import com.javatar.practice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> students(){
        return studentRepository.findAll();
    }

    @PostMapping
    public Student save(@RequestBody Student student){
        return studentRepository.save(student);
    }

}
