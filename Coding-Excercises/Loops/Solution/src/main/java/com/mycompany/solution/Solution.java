package com.mycompany.solution;

import java.util.Scanner; 


public class Solution {

    public static void main(String[] args) {
        //Do not write here, okay ill write here
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
        if (n == 0)
    System.out.println("Goodbye!");
    }
    
    
    public static void solution(int n){
        for (int i = 1; i <= 10; i++)
        {
            int result = n * i;
            System.out.println(n + " x "  + i + " = " + result);
        }
        //write your code here        
    }
    
    
}
