/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_18Mei2024;

/**
 *
 * @author AULIA SYFA
 */
public class Factorialiterasi {
    static int factorial(int n){
        int result = 1;
        for(int i=n; i>1;i--){
            result*=i;
        }
        return result;
    }
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[]args){
        //TODO code application logic here
        int n=4;
        System.out.println(factorial(n));
    }
    
}
