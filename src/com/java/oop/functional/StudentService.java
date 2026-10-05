package com.java.oop.functional;

import java.util.List;

@FunctionalInterface
public interface StudentService {
    void displayStudents(List<Student> studentsList);
}
