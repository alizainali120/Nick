/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.statics;

/**
 *
 * @author alizainali
 */
public class Statics {

    public static void main(String[] args) {
       Student s1 = new Student("Sana", "sana@gmail.com", "123-456-7890");
       Student s2 = new Student("Jean", "jean@gmail.com", "404 899-9955");
       Student s3 = new Student();
       
       String name = s1.getName();
       System.out.println("Student 1 name: " + name);
       System.out.println(s2);
       
       int count = Student.getTotalStudents(); 
       System.out.println("Total no of students: " + count);
    
    }
}
