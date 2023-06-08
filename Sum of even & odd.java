import java.util.Scanner;

class Solution {

    

    public static void main(String args[]) {

        

        // Write code here

        int es=0,os=0;

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=N;i>0;i=(i/10))

        {

            int r=(i%10);

            if((r%2)==0)

            es+=r;

            else

            os+=r;

        }

        System.out.println(es+" "+os);

    }

}
