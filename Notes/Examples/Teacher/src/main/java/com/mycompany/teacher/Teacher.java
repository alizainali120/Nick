/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teacher;

/**
 *
 * @author alizainali
 */
public class Teacher {
    
    public void printTeacherToDo(String str){
        System.out.println(str + ", Make sure to fill out timesheet");
        System.out.println("Make sure to check homework");
    } 
    
    public int returnAge(int year){
        return 2023 - year;
    }
    

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.printTeacherToDo("Ali");
        t.printTeacherToDo("Jack");
        
        int age = t.returnAge(1998);
        System.out.println(age);
    }
}
