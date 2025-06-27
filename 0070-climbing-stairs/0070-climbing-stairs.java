class Solution {
    Map<Integer, Integer> memo = new HashMap<>();
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        } 
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(n, result);
        return result;
    }
}