import java.util.* ;

import java.io.*; 

import java.util.Scanner;

 

//import jdk.internal.jshell.tool.resources.l10n;

 

class Solution {

 

    static String reverseEachWord(String input)

    {

        // Write your code here

        int n=input.length();

        int s=0;

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){

            if(input.charAt(i)==' '){

                for(int j=i-1;j>=s;j--){

                    sb.append(input.charAt(j));

                }

                sb.append(' ');

                s=i+1;

            }

        }

 

        for(int j=n-1;j>=s;j--){

                    sb.append(input.charAt(j));

                }

        return sb.toString();

    }

 

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String ans = reverseEachWord(input);

        System.out.println(ans);

    }

}
