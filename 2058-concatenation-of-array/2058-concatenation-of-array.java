class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] arr = new int[2 * len];
        for (int i = 0; i < len; i++) {
            arr[i] = nums[i];
            arr[i + len] = nums[i];
        }
        return arr;
    }
}