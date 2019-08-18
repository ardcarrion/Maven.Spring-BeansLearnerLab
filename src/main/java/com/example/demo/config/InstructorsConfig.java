package com.example.demo.config;

import com.example.demo.objects.Instructor;
import com.example.demo.objects.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors() {
        return new Instructors();
    }

    @Bean
    public Instructors tcUkInstructors() {
        return new Instructors();
    }

    @Primary
    @Bean
    public Instructors instructors(){
        return new Instructors();
    }

}
