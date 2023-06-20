package com.example.qualifier.demo.student_profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile implements PrintInfo {

    @Autowired
    @Qualifier("student1")
    private Student student1;

    @Autowired
    @Qualifier("student2")
    private Student student2;

    /*@Autowired
    @Qualifier("student1")
    public void setStudent(Student student) {
        this.student = student;
    }*/

    @Override
    public void printName() {
        System.out.println("Name : " + student1.getName());
        System.out.println("Name : " + student2.getName());
    }

    @Override
    public void printAge() {
        System.out.println("\nAge  : " + student1.getAge());
        System.out.println("Age  : " + student2.getAge());
    }
}
