class Solution {
    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        int distinctCount = 0;

        for (int num : nums) {
            if (num == first || num == second || num == third) continue;

            distinctCount++;
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        return (distinctCount >= 3) ? (int) third : (int) first;
    }
}