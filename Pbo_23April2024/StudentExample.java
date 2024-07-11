/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pbo_23April2024;

/**
 *
 * @author AULIA SYFA
 */
public class StudentExample {
    
        public static void printlnformation(Person p){
            if(p instanceof Student){
                System.out.println("Nama Siswa   :"+p.getName());
                System.out.println("Alamat Siswa :"+p.getAddress());
            }
            if(p instanceof Employee){
                System.out.println("Nama karyawan :"+p.getName());
                System.out.println("Alamat        :"+p.getAddress());
            }
        }
        public static void main(String[] args) {
        Person ref;
        Student ali = new Student();
        ali.setName("Ali");
        ali.setAddress("Padang");
        Employee budi = new Employee();
        budi.setName("Budi");
        budi.setAddress("Bukit Tinggi");
        
        printlnformation(ali);
        printlnformation(budi);
        
        /*ref = ali;
        System.out.println("Nama     :" +ref.getName());
        System.out.println("Alamat   :" +ref.getAdress());
        
        ref = budi;
        System.out.println("Nama     :" +ref.getName());
        System.out.println("Alamat   :" +ref.getAdress());*/
        
      
    }
    
}
