package com.example.full_stack_caique.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/students" )
public class StudentController {


    @GetMapping
    public List<Student> getALlStudents () {
        List<Student> students = Arrays.asList(
                new Student(
                        1L,
                        "caique",
                        "caique3066@gmail.com",
                        Gender.MALE
                ) ,
                new Student(
                        1L,
                        "Ianna",
                        "ianna@gmail.com",
                        Gender.FEMALE
                )

        );
        return students;

    }
}
