package com.example.demo.objects;

import java.util.Arrays;
import java.util.List;

abstract class People<T extends Person> implements Iterable<T>{

    private List<T> personList;

    public People(List<T> personList) {
        this.personList = personList;
    }

    public People(T... t) {
        this.personList = Arrays.asList(t);
    }

    public void add (T person) {
        personList.add(person);
    }

    public void remove(T person) {
        personList.remove(person);
    }

    public int size(T person) {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<T> iterable) {
        iterable.forEach(person -> personList.add(person));
    }

    public T findById(long id) {
        for (T person : personList) {
            if (person.getId() == id) return person;
        }
        return null;
    }

    public List<T> findAll() {
        return personList;
    }

}
