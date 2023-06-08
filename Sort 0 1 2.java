import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int count0=0;
        int count1=0;
        int count2=0;
        for(int num:arr){
            if(num==0) count0++;
            else if(num==1) count1++;
            else count2++;
        }
        for(int i=0;i<arr.length;i++){
            if(i<count0) arr[i]=0;
            else if(i<count0+count1) arr[i]=1;
            else arr[i]=2;
        }
    }
}
