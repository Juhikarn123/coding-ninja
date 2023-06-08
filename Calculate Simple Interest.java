import java.util.* ;

 

import java.io.*;  
class Solution { public static void main(String args[])
 {    // Write code here   
 Scanner sc = new Scanner(System.in); 
  int amount = sc.nextInt(); 
   float rate = sc.nextFloat();  
   int time = sc.nextInt();  
   float si =  (amount*rate*time)/100;   
    System.out.println((int)si);   } }
