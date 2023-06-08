import java.util.* ;

import java.io.*; 

import java.util.Scanner;

 

class ComplexNumbers {

    

    // Write your code here

    

    public void add(int r1,int i1,int r2,int i2)

    {

        int r3=r1+r2;

        int i3=i1+i2;

        System.out.println(r3+" + i"+i3);

        

    }

    public void multiply(int r1,int i1,int r2,int i2)

    {

        int r3=r1*r2-i1*i2;

        int i3=r1*i2+r2*i1;

        System.out.println(r3+" + i"+i3);

        

    }

        

}

 

class Solution {

    

    public static void main(String args[]) {

        

        // Write your code here

        Scanner sc=new Scanner(System.in);

        int r1=sc.nextInt();

        int i1=sc.nextInt();

        int r2=sc.nextInt();

        int i2=sc.nextInt();

 

        int c=sc.nextInt();

        ComplexNumbers com=new ComplexNumbers();

 

        if(c==1)

        {

            com.add(r1,i1,r2,i2);

 

        }

 

        else if(c==2)

        {

            com.multiply(r1,i1,r2,i2);

 

        }

        else

        {

            System.out.println("");

        }

        

        

    }

}

        
