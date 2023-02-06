/* Problem Statement
 You are given a string S containing only uppercase English characters .find whether S is the same as its reflection in the mirror.
 For example,S="AMAMA" is the same as its reflection in the mirror.
Detailed explanation ( Input/output format, Notes, Constraints, Images )
Sample Input 1:
1
ITATI

Sample Output 1:
YES
Explanation Of Sample Input 1:
String “ITATI” is the same as its reflection in the mirror.
Sample Input 2:
2
MMMM
MZM
Sample Output 2:
YES
NO
*/

code:-
import java.util.* ;
import java.io.*; 
public class Solution {
    static String Reverse(String s)
     {
        // Write your code here.
        char[] charArray=s.toCharArray();
        reverse(charArray,0,charArray.length-1);
        return new String(charArray);
     }
    public static Boolean isReflectionEqual(String s)
    {
        HashSet<Character> symmetric=new HashSet<>();
        symmetric.add('A');
        symmetric.add('H');
        symmetric.add('I');
        symmetric.add('M');
        symmetric.add('O');
        symmetric.add('T');
        symmetric.add('U');
        symmetric.add('V');
        symmetric.add('W');
        symmetric.add('X');
        symmetric.add('Y');
        int n=s.length();
        for(int i=0;i<n;i++)
        {
           if(symmetric.contains(s.charAt(i))==false)
           {
               return false;
           }
        }
        String rev=s;
        s=Reverse(s);
        if(rev.equals(s))
        {
         return true; 
        }
        else
        {
            return false;
        }
    }



static void reverse(char str[],int start,int end)
{
    char temp;
    while(start<=end)
    
    {
        temp=str[start];
        str[start]=str[end];
        str[end]=temp;
        start++;
        end--;
    }
}

public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in); 
    String s=sc.nextLine();
    if (isReflectionEqual(s))
    {
        System.out.println("YES");
    }
    else
    {
        System.out.println("NO");
    }
}
}

