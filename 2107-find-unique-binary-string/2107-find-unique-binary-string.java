class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
            char bit = nums[i].charAt(i) == '0' ? '1' : '0';
            sb.append(bit);
        }
        return sb.toString();
    }
}
