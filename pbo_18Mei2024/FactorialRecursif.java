/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_18Mei2024;

/**
 *
 * @author AULIA SYFA
 */
public class FactorialRecursif {
     static int factorial(int n){
         if(n == 1){
             /*The base case*/
             return 1;
         }
         /*Recursive definition: self-invocation*/
         return factorial(n - 1) * n;
     }
     /**
      * @param args the command line arguments
      */
     public static void main(String[]args){
          //TODO code application logic here
         int n =4;
         System.out.println(factorial(n));
     }
    
 }
