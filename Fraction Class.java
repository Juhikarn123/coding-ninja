import java.util.* ;

import java.io.*; 

 

class Fraction {

 

    // Complete the class

    int n,d;

    public Fraction(int n,int d){

        this.n=n;

        this.d=d;

    }

    public void add(Fraction c){

        this.n=this.n*c.d+this.d*c.n;

        this.d=this.d*c.d;

        simplify();

        print();

    }

    public void multiply(Fraction c){

        this.n=this.n*c.n;

        this.d=this.d*c.d;

        simplify();

        print();

    }

    public void simplify(){

        int g=gcd(this.n,this.d);

        this.n=this.n/g;

        this.d=this.d/g;

    }

    public int gcd(int a,int b){

        int gc=1;

        for(int i=1;i<=a && i<=b;i++){

            if(a%i==0 && b%i==0){

                gc=i;

            }

        }

        return gc;

    }

    public void print(){

        System.out.println(this.n+"/"+this.d);

    }

 

}

 

class Solution {

 

    public static void main(String args[]) {

 

        // Write your code here

        Scanner sc=new Scanner(System.in);

        int num1=sc.nextInt();

        int den1=sc.nextInt();

        Fraction f1=new Fraction(num1, den1);

        int l=sc.nextInt();

        for(int i=0;i<l;i++){

            int ch=sc.nextInt();

            int num2=sc.nextInt();

            int den2=sc.nextInt();

            Fraction f2=new Fraction(num2, den2);

            if(ch==1){

                f1.add(f2);

            }

            else if(ch==2){

                f1.multiply(f2);

            }

        }

    }

}

 
