import java.util.* ; 
import java.io.*;  
class Solution 
{ public static 
void main(String args[])
 {    // Write code here  
 Scanner sc = new Scanner (System.in); 
  int n = sc.nextInt();  
  int arr[] = new int[n]; 
   int res =-1; 
    for(int i=0;i<n;i++)
	{  
		 arr[i]=sc.nextInt();

 }  
 int element = sc.nextInt();
  for(int i=n-1;i>=0;i--)
  { 
	   if(arr[i]==element)
	   {   
		   res = i; 
		     break; 
			  } 
			    }  
				System.out.print(res);  

  } }

