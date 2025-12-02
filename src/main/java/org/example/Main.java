package org.example;
import java.util.*;

import java.util.Scanner;

 class Student {

    private String name;
    private int rollNo;
    private String section;

    // Constructor
    Student(String name, int rollNo, String section){
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // Getters
    public String getName() { return name; }
    public int getRollNo() { return rollNo; }
    public String getSection() { return section; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }
    public void setSection(String section) { this.section = section; }

    public void printDetails() {
        System.out.println(this.name + ", " + this.rollNo + ", " + this.section);
    }
}

public class Main {

    public static void main(String[] args) {

        // Create a list to store students
        List<Student> list = new ArrayList<>();

        // Add student objects
        list.add(new Student("Raihan", 1, "A"));
        list.add(new Student("Hasan", 2, "B"));
        list.add(new Student("Mim", 3, "C"));

        // Loop and print all student details
        for (Student s : list) {
            s.printDetails();
        }


        Student s = new Student("Raihan", 1, "A");
        // Using getters
        System.out.println("Name: " + s.getName());
        System.out.println("Roll: " + s.getRollNo());
        System.out.println("Section: " + s.getSection());

        // Using setters
        s.setName("Karim");
        s.setRollNo(10);
        s.setSection("B");

        System.out.println("Updated Details:");
        System.out.println(s.getName() + ", " + s.getRollNo() + ", " + s.getSection());
    }
}