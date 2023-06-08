import javafx.util.Pair;

import java.util.Scanner;

 

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 

        int a = scanner.nextInt();

 

        

        int b = scanner.nextInt();

 

        Pair<Integer, Integer> numbers = new Pair<>(a, b);

 

        Pair<Integer, Integer> swappedNumbers = swap(numbers);

 

        int swappedA = swappedNumbers.getKey();

        int swappedB = swappedNumbers.getValue();

 

       

        System.out.println( swappedA + " " + swappedB);

    }

 

    public static Pair<Integer, Integer> swap(Pair<Integer, Integer> swapValues) {

        int temp = swapValues.getKey();

        int swappedA = swapValues.getValue();

        int swappedB = temp;

 

        return new Pair<>(swappedA, swappedB);

    }

}

 

