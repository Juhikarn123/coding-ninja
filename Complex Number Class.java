import java.util.Scanner;

 

class ComplexNumbers 
{    
	int a,b,c,d;    
	private int sum1;    
	private int sum2;    
	private int m1;    
	private int m2;

   // int c1=a+ib;    // int c2=c+id;    
   ComplexNumbers(int x,int y,int z,int w){        a=x;        b=y;        c=z;        d=w;    }   public void plus(){         sum1=a+c;         sum2=b+d;

   }    
   void multiply()
   {         
	   m1=a*c-b*d;         
	   m2=a*d+b*c;

   }    
   void print(int n)
   {        
	   if(n==1)
	   {            
		   System.out.println(sum1+" + "+"i"+sum2);       
		    }        
			else if(n==2)
			{            
				System.out.println(m1+" + "+"i"+m2);        
				}    
				}    // Write your code here

}

class Solution {

   private static int choice;

   public static void main(String args[]) 
   {        
	Scanner sc = new Scanner(System.in);        
   int a1 = sc.nextInt();        
   int a2 = sc.nextInt();        
   int a3 = sc.nextInt();        
   int a4 = sc.nextInt();        
   ComplexNumbers obj = new ComplexNumbers(a1, a2, a3, a4);             
   choice = sc.nextInt();                    

           switch (choice)
		    {                
				case 1: 
				{                    
					obj.plus();                    
					break;                
					}                
					case 2: 
					{                    
						obj.multiply();                   
						 break;                
						 }

           }            
		   obj.print(choice);        

           // Write your code here

   } 
   }  

