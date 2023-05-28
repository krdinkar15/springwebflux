package com.example.demo;

import com.example.entity.Student;
import reactor.core.publisher.Flux;

import java.util.List;

public interface StudentServiceReactive {
    Flux<Student> fetchAllStudents();
}
