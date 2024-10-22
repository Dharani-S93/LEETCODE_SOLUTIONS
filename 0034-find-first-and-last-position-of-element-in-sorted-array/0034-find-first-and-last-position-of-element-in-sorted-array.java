class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] > target)
            end = mid-1;
            else if(nums[mid] < target)
            start = mid+1;
            else{
            int s=mid;
            int e=mid;
            for(int i=1;i<=mid;i++){
                if(nums[mid-i]!=target)
                break;
                s=mid-i;
            }
            for(int j=1;j<nums.length-mid;j++){
                if(nums[mid+j]!=target)
                break;
                e=mid+j;
            }
            return new int[]{s,e};
            }
        }
        return new int[]{-1,-1};
    }
}