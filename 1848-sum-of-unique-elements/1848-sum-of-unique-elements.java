class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] n = new int[1000];
        for(int i: nums){
            n[i]++;
        }
        for(int i:nums){
            if(n[i] == 1) {
            sum += i;
            }
        }
        return sum;
    }
}