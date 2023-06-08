import java.util.* ;
import java.io.*; 
public class Solution{
    public static int fibonacciNumber(int n){
        // Write your code here.
         int n1 = 0;

        int n2 = 1;

        int result=0;

        int mod = ((int)Math.pow(10,9))+7;

        for(int i=2; i<=n; i++){

            result =  n1+n2;

            n1=n2;

            n2=result;

            if(n2>+mod){

                n2 -=mod;

            }

        }

        return n2;
    }
}
