package com.example.demo.objects;

import java.util.Iterator;

public class Instructor extends Person implements Teacher {
    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        Iterator<? extends Learner> iterator =  learners.iterator();
        int length = 0;
        while (iterator.hasNext()) {
            length++;
            iterator.next();
        }
        double numberOfHoursPerLearner = numberOfHours/length;
        learners.forEach(learner -> teach(learner, numberOfHoursPerLearner));
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }
}
