package com.crud.FirstCrud.service;

import com.crud.FirstCrud.entity.Student;
import com.crud.FirstCrud.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student createStudent(Student studentReq) {
        System.out.println("inside student service");
        Student student=studentRepository.save(studentReq);
        System.out.println("exiting student service");
        return student;
    }
}
