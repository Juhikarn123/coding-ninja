import java.util.* ;

import java.io.*; 

class Person {

    

    // Complete the class

    private String name;

    private int age;

    String getName(){

        return name;

    }

    void setName(String Name){

        this.name=Name;

    }

    int getAge(){

        return age;

    }

    void setAge(int Age){

        this.age=Age;

    }

}

 

class Solution {

    

    public static void main(String args[]) {

// Write your code here

        Scanner sc = new Scanner(System.in);

        String name=sc.next();

        int age=sc.nextInt();

        Person p=new Person();

        p.setName(name);

        p.setAge(age);

        System.out.println("The name of the person is "+name+" and the age is "+age+".");

        

        

    }

}
