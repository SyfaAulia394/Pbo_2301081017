/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pbo_23April2024;

/**
 *
 * @author AULIA SYFA
 */
public class Student extends Person {
    public Student(){
        super();
       // super("Ali","Padang");
       super.name="Ali";
       super.address="Padang";
       
        System.out.println("Student Constructor");
    }
    @Override
    public String getName(){
    System.out.println("Student: getName");
    return name;
    }
}
