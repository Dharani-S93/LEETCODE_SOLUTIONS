import java.util.*;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> node = new HashMap<>();
        Map<Integer, Integer> color = new HashMap<>();
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0], y = queries[i][1];

            if (node.containsKey(x)) {
                int prevColor = node.get(x);
                if (prevColor == y) { 
                    ans[i] = color.size(); 
                    continue;
                }
                if (color.get(prevColor) == 1) 
                    color.remove(prevColor);
                else 
                    color.put(prevColor, color.get(prevColor) - 1);
            }

            node.put(x, y);
            color.put(y, color.getOrDefault(y, 0) + 1);
            ans[i] = color.size();
        }

        return ans;
    }
}