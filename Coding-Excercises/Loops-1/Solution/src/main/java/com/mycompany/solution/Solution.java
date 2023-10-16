package com.mycompany.solution;

import java.util.Scanner; 


public class Solution {

    public static void main(String[] args) {
        //Do not write here
        Scanner input = new Scanner(System.in);
        int n = 2;
        
        while (n > 0){
            System.out.println("Enter integer between 2-10 to print multiples");
            System.out.println("Enter 0 to exit");
            n = input.nextInt();
            solution(n);
            System.out.println("");
            System.out.println("");
        }
    }
    
    public static void solution(int n){
        //write your code here        
    }
    
    
}
