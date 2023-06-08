import java.util.* ;

import java.io.*; 

public class Solution {

    public static long evenSumTillN(int n) 

    {

        long s=0;

        for(int i=2;i<=n;i+=2)

        {

            s+=i;

        }

        return s;

    }

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.print("Sum of all even numbers till 'N' will be : ");

        for(int i=2;i<=x;i+=2)

        {

            System.out.print(i+" ");

        }

        System.out.print("="+evenSumTillN(x));

    }

}
