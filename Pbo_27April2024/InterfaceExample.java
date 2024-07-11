/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pbo_27April2024;

/**
 *
 * @author AULIA SYFA
 */
public class InterfaceExample {
    public static void main(String[] args){
        Relation myInteger = new MyInteger();
        System.out.println(myInteger.isGreater(5, 4));
        Relation myDouble = new MyDouble();
        System.out.println(myDouble.isGreater(5.6, 7.3));
        
        Line line1 = new Line(1.0,5.0,2.0,4.0);
        Line line2 = new Line(2,4,1,3);
        
        Relation line = new Line();
        System.out.println(line.isGreater(line1, line2));
        System.out.println("Line 1"+line1.getLenght());
        System.out.println("Line 2"+line2.getLenght());
      
    }
}
