package com.mycompany.solution;

import java.util.Scanner; 


public class Solution {

    public static void main(String[] args) {
        //Do not write here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter String");
        String str = input.nextLine();

        System.out.println("Enter length of the substrings to find");
        int len = input.nextInt();

        String result = getSmallestAndLargest(str, len);
        System.out.println(result);
    }
    
    public static String getSmallestAndLargest(String s, int k){
        //write your code here    
        return s;    
    }
    
    
}
