package com.crud.FirstCrud.service;

import com.crud.FirstCrud.entity.Student;
import com.crud.FirstCrud.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    public final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudentById(Long id) {
        Optional<Student> studentResp= studentRepository.findById(id);
        if(studentResp.isPresent()){
            return studentResp.get();
        }
        return null;
    }

    public Student createStudent(Student studentReq) {
        return studentRepository.save(studentReq);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudentById(Long id, Student studentReq) {
        Optional<Student> existingStudent= studentRepository.findById(id);
        if(existingStudent.isEmpty()){
            return null;
        }
        Student studentToSave=existingStudent.get();
        studentToSave.setName(studentReq.getName());
        studentToSave.setEmail(studentReq.getEmail());
        studentToSave.setAge(studentReq.getAge());
        studentToSave.setRollNo(studentReq.getRollNo());
        studentToSave.setSubject(studentReq.getSubject());
        return studentRepository.save(studentToSave);
    }

    public Boolean deleteStudentById(Long id) {
        boolean isStudent=studentRepository.existsById(id);
        if(!isStudent){
           return false;
        }
        studentRepository.deleteById(id);
        return true;
    }
}
