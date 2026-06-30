package com.crud.FirstCrud.repository;

import com.crud.FirstCrud.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public Student save(Student studentReq) {
        System.out.println("inside repository");
        Student studentRes=new Student();
        studentRes.setName("Aditya");
        studentRes.setEmail(studentReq.getEmail());
        studentRes.setAge(studentReq.getAge());
        studentRes.setRollNo(studentReq.getRollNo());
        studentRes.setSubject(studentReq.getSubject());
        System.out.println("exiting repository");
        return studentRes;
    }
}
