package com.SyedShaheeqRaza.java;

import java.util.Scanner;

public class Student {
    private String cms;
    private String name;
    private double gpa;
    private int age;

    // Constructor to initialize student details
    public Student(String cms, String name, double gpa, int age) {
        this.cms = cms;
        this.name = name;
        this.gpa = gpa;
        this.age = age;
    }

    // Method to get student details from the user
    public void getInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CMS ID: ");
        cms = scanner.nextLine();

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter GPA: ");
        gpa = scanner.nextDouble();

        System.out.print("Enter Age: ");
        age = scanner.nextInt();
    }

    // Method to print student details
    public void printDetail() {
        System.out.println("Student Details:");
        System.out.println("CMS ID: " + cms);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student = new Student("", "", 0.0, 0);

        // Get student details from the user
        student.getInfo();

        // Print the student's details
        student.printDetail();
    }
}
