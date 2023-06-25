public class Solution {     

    public static String kthChildNthGeneration(int n, long k) {

         // Write your code here

         return (Long.bitCount(k-1)&1)==0?"Male":"Female";

    }

}
