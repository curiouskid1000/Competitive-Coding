public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
         long SN = (n*(n+1))/2;
         long S2N = (n*(n+1)*(2*n+1))/6;
         long s = 0,s2 = 0;
         for(int i = 0;i<arr.size();i++){
             s += arr.get(i);
             s2 += (long)arr.get(i) * (long)arr.get(i);
         }
         long val1 = s - SN;
         long val2 = s2 - S2N;
         val2 = val2/val1;
         long x = (val1+val2)/2;
         long y = x -val1;
         int [] ans = {(int)y,(int)x};
        return ans;
    }
}