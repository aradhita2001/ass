package com.example.jpafirstproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpafirstproject.entity.Student;
import com.example.jpafirstproject.repository.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;
    
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id){
        return studentRepository.findById(id);
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> updateStudent(Long id, Student updatedStudent){
        return studentRepository.findById(id).map(student->{
            student.setEmail(updatedStudent.getEmail());
            student.setFirstName(updatedStudent.getFirstName());
            student.setLastName(updatedStudent.getLastName());
            return studentRepository.save(student);
        });
    }

    public void deleteStudent(Long Id) {
        studentRepository.deleteById(Id);
    }
}
