import java.util.*;

class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int[] count = new int[2]; 
        count[0] = 1; 
        int sum = 0, res = 0;
        
        for (int num : arr) {
            sum += num;
            int p = sum % 2;
            res = (res + count[1 - p]) % MOD;
            count[p]++;
        }
        
        return res;
    }
}