package com.example.demo.config;

import com.example.demo.objects.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        return new Students();
    }

    @Bean
    public Students previousStudents() {
        return new Students();
    }
}
