package com.example.component;

import com.example.demo.StudentServiceReactive;
import com.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/mysql")
public class DatabaseController {

//    @Autowired
//    private StudentService studentService;

    @Autowired
    private StudentServiceReactive studentServiceReactive;


//    @GetMapping("/boot")
//    public List<Student> findAllStudents()
//    {
//        return studentService.fetchAllStudents();
//    }


    @GetMapping("/reactive")
    public Flux<Student> findAll()
    {
        return studentServiceReactive.fetchAllStudents();
    }
}
