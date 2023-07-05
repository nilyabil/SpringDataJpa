package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Student;

@SpringBootTest
@DataJpaTest 
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent()
    {
        Student student=Student.builder()
        .emailId("nil@gmail.com")
        .firstName("Nilesh")
        .lastNamel("Bhagat")
        .guardianEmail("nikhil@gmail.com")
        .guardianName("Nikhil")
        .guardianMobile("8975343223")
        .build();
        studentRepository.save(student);
        
    }

    @Test
    public void printAllStudents()
    {
        List<Student> studentList=studentRepository.findAll();
        System.out.println("StudentList = "+studentList);
    }


}
