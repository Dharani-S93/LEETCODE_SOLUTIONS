import java.util.Scanner;

class Solution {
    public int findMin(int[] nums) {
        int s = 0, e = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[e]) {
                s = mid + 1;
            } else {
                e = mid; 
            }
        }
        return nums[s]; 
    }
}