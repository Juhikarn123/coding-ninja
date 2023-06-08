import java.util.* ;

import java.io.*; 

class Square {

    int length;

    // Write your code here

    public Square(){

        length=10;

    }

    public Square(int l){

        length=l;

    }

    public void print(){

        System.out.println(length*length);

    }

}

    

class Solution {

    

    public static void main(String args[]) {

        

        // Write your code here

        Square s1=new Square();

        Square s2=new Square(7);

        s1.print();

        s2.print();

    }

}

    

        
