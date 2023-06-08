import java.util.* ;

import java.io.*;

import java.util.Scanner;

class Solution {

 

// Write your printDivisor function here

 

public static void printDivisor(int n){

 for (int i=1;i<=n;i++){

      System.out.print(n%i==0?i+" ":"");

 }

}

public static void main(String args[]) {

 Solution obj = new Solution();

 Scanner sc = new Scanner(System.in);

 int n = sc.nextInt();

 obj.printDivisor(n);

 }

}

