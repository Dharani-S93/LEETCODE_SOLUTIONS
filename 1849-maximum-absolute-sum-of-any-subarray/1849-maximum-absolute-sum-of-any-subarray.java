import java.util.*;

class Solution {
    public static int maxAbsoluteSum(int[] nums) {
        int max = 0, min = 0, curMax = 0, curMin = 0;
        
        for (int num : nums) {
            curMax = Math.max(0, curMax + num);
            max = Math.max(max, curMax);
            
            curMin = Math.min(0, curMin + num);
            min = Math.min(min, curMin);
        }
        
        return Math.max(max, Math.abs(min));
    }
}