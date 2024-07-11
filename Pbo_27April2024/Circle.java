/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pbo_27April2024;

/**
 *
 * @author AULIA SYFA
 */
public class Circle {
    private double radius;
    public Circle(double radius){
        
    }
    
    public void setRadius(int radius){
        this.radius = radius;
    }
    public String getName(){
        return "Circle";
    }
   public double getArea(){
    return Math.PI * radius * radius;
   }
}

