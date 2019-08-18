package com.example.demo.config;

import com.example.demo.objects.Classroom;
import com.example.demo.objects.Instructor;
import com.example.demo.objects.Instructors;
import com.example.demo.objects.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {

    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @Autowired
    @Qualifier("students")
    Students students;

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;

    @Bean
    public Classroom currentCohort() {
        return new Classroom(instructors, students);
    }

    @Bean
    public Classroom previousCohort() {
        return new Classroom(instructors, previousStudents);
    }
}
