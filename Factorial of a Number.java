import java.util.Scanner;

class Solution {

    

    public static void main(String args[]) {

        

        // Write code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int s=1;

        if(n<0)

        System.out.print("Error");

        else

        {

          for(int i=1;i<=n;i++)

           {

            s*=i;

           }

        System.out.print(s);

        }

        

        

    }

}

