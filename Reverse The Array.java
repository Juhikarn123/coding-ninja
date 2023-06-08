import java.util.* ;

import java.io.*; 

import java.util.ArrayList;

 

import com.sun.org.apache.bcel.internal.generic.SWAP;

 

public class Solution 

{

    public static void reverseArray(ArrayList<Integer> arr, int m)

    {

        // Write your code here.

        int n=arr.size();

        int s=m+1,e=n-1;

        while(s<e){

            Collections.swap(arr, s, e);

            s++;

            e--;

 

        }

    }

}

 
