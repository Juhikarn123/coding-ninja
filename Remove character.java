import java.util.* ;

import java.io.*; 

import java.util.Scanner;

 

class Solution {

 

    static String removeAllOccurrencesOfChar(String input, char c) {

        // Write your code here

        StringBuilder sb = new StringBuilder();

        int n=input.length();

        for(int i=0;i<n;i++){

            if(input.charAt(i)!=c){

                sb.append(input.charAt(i));

            }

        }

 

        return sb.toString();          

    }

 

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        char c = sc.next().charAt(0);

        String ans = removeAllOccurrencesOfChar(input, c);

        System.out.println(ans);

    }

}