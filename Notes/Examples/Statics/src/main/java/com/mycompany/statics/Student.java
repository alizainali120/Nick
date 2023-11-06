/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.statics;

/**
 *
 * @author alizainali
 */
public class Student {
    private String name;
    private String email;
    private String phoneNumber;

    private static int counter = 0;
    
    public static int getTotalStudents() {
        return counter;
    }
    
    public Student(){
        counter++;
    }
    
    public Student(String initName, String initEmail, String initPhone)
    {
        name = initName;
        email = initEmail;
        phoneNumber = initPhone;
        counter++;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString() {
       return name + ": " + email + " " + phoneNumber;

    }
    
    
    
    
    
    
}
