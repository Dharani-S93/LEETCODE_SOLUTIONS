class Solution {
public int searchInsert(int[] nums, int target) {
        int ans = 0 ;
        int temp = 0;
        for (int i = 0; i <= nums.length - 1 ; i++)
        {
            if (target == nums[i])
            {
                temp = i;
 }
            else if (nums[i] < target ){
                temp++;
}
        ans = temp;
}
        return ans;
}
}