/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_18Mei2024;

/**
 *
 * @author AULIA SYFA
 */
public class FPB {
    public static int fpb(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        int x = 14;
        int y = 6;
        System.out.println("FPB dari " + x + " dan " + y + " adalah " + fpb(x, y));
    }
}


