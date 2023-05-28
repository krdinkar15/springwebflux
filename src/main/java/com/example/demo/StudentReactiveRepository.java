package com.example.demo;

import com.example.entity.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReactiveRepository extends ReactiveCrudRepository<Student,Long> {
}
