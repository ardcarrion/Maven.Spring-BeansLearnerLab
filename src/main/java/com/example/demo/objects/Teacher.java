package com.example.demo.objects;

public interface Teacher {
    void lecture(Iterable<? extends Learner> learners, double numberOfHours);
    void teach(Learner learner, double numberOfHours);
}
