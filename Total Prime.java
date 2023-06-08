import java.util.* ;

import java.io.*; 

import java.util.Scanner;

class CountPrime 

{   

    int c=0;

    int totalPrime(int S, int E)

    {

        for(int i=S;i<=E;i++)

        {

            int c1=0;

            for(int j=1;j<=i;j++)

            {

                if(i%j==0)

                c1++;

            }

            if(c1==2)

            c++;

        }

        return c;

    }   

}

 

class Solution {

    public static void main(String args[]) {

        

        CountPrime obj = new CountPrime();

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        int e = sc.nextInt();

        System.out.println(obj.totalPrime(s, e));

    }

}   
