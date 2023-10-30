package com.mycompany.solution;

import java.util.Scanner; 


public class Solution {

    public static void main(String[] args) {
        //Do not write here
        Scanner input = new Scanner(System.in);
        String str = "";
    
        while (!str.equals("E")) {
            System.out.println("Enter String");
            System.out.println("Enter E to exit");
            str = input.nextLine();
            if(!str.equals("E")) {
                String output = solution(str);
                System.out.println(output);
                System.out.println("");
                System.out.println("");
            }
        }
    }
    
    public static String solution(String str){
        //write your code here
        String endString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                String tempString = str.substring(i, i + 1);
                endString += tempString;
            }
        }    
        return endString;    
    }
    
    
}
