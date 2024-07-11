/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_26Maret2024;

import Pbo_23April2024.Person;

/**
 *
 * @author AULIA SYFA
 */
// Kelas Induk atau Parent
class Student {
    protected String name;
    protected int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Kelas Anak atau Turunan
class StudentRecord extends Student {
    private int studentID;

    // Constructor
    public StudentRecord(String name, int age, int studentID) {
        super(name, age); // Memanggil konstruktor kelas induk
        this.studentID = studentID;
    }

    // Method
    public void displayRecord() {
        super.displayInfo(); // Memanggil method dari kelas induk
        System.out.println("Student ID: " + studentID);
    }
}

/*public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan
        StudentRecord studentRecord = new StudentRecord("Alice", 20, 12345);

        // Memanggil method
        studentRecord.displayRecord();
    }*/



    

