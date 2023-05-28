package com.example.demo;

import com.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;
@Service
public class StudentServiceImplReactive implements StudentServiceReactive {


    @Autowired
    private StudentReactiveRepository studentReactiveRepository;
    @Override
    public Flux<Student> fetchAllStudents() {
        return  studentReactiveRepository.findAll();
    }
}
