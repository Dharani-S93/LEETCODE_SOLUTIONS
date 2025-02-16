class Solution {
    public int[] constructDistancedSequence(int n) {
        int len = n * 2 - 1;
        int[] result = new int[len];
        boolean[] used = new boolean[n + 1];
        
        backtrack(0, result, used, n);
        return result;
    }
    
    private boolean backtrack(int pos, int[] result, boolean[] used, int n) {
        if (pos == result.length) {
            return true;
        }
        
        if (result[pos] != 0) {
            return backtrack(pos + 1, result, used, n);
        }
        
        for (int i = n; i >= 1; i--) {
            if (used[i]) continue;
            
            if (i == 1) {
                result[pos] = i;
                used[i] = true;
                if (backtrack(pos + 1, result, used, n)) {
                    return true;
                }
                result[pos] = 0;
                used[i] = false;
            } else {
                if (pos + i < result.length && result[pos + i] == 0) {
                    result[pos] = i;
                    result[pos + i] = i;
                    used[i] = true;
                    if (backtrack(pos + 1, result, used, n)) {
                        return true;
                    }
                    result[pos] = 0;
                    result[pos + i] = 0;
                    used[i] = false;
                }
            }
        }
        
        return false;
    }
}