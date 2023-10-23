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
        String highestString = "";
        String lowestString = "zzz";
        int leng = (s.length() - k);
        for (int i = 0; i <= leng; i++) {
            String substring = s.substring(i, i + k);
            int hol = substring.compareTo(highestString);
            if (hol > 0) {
                highestString = substring;
            }
            hol = substring.compareTo(lowestString);
            if (hol < 0) {
                lowestString = substring;
            }
        }
        String end = lowestString + "\n" + highestString;

        return end;    
    }
    
    
}
