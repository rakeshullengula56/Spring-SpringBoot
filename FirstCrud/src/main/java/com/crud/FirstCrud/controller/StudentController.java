package com.crud.FirstCrud.controller;

import com.crud.FirstCrud.entity.Student;
import com.crud.FirstCrud.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;
    StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println("inside controller");
        Student createdStudent=studentService.createStudent(student);
        System.out.println("exiting controller");
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdStudent);
    }
}
