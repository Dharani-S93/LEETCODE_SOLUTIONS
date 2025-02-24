import java.util.*;

class Solution {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n = amount.length;
                List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < n; i++) tree.add(new ArrayList<>());
        for (int[] edge : edges) {
            tree.get(edge[0]).add(edge[1]);
            tree.get(edge[1]).add(edge[0]);
        }

        int[] bobTime = new int[n];
        Arrays.fill(bobTime, Integer.MAX_VALUE);
        findBobPath(tree, bob, -1, 0, bobTime);
        return dfsAlice(tree, 0, -1, 0, 0, bobTime, amount);
    }
    private boolean findBobPath(List<List<Integer>> tree, int node, int parent, int time, int[] bobTime) {
        bobTime[node] = time; 
        if (node == 0) return true; 

        for (int neighbor : tree.get(node)) {
            if (neighbor == parent) continue;
            if (findBobPath(tree, neighbor, node, time + 1, bobTime)) return true;
        }

        bobTime[node] = Integer.MAX_VALUE; 
        return false;
    }
    private int dfsAlice(List<List<Integer>> tree, int node, int parent, int time, int profit, int[] bobTime, int[] amount) {
        if (time < bobTime[node]) {
            profit += amount[node];  
        } else if (time == bobTime[node]) {
            profit += amount[node] / 2; 
        }
        int maxProfit = Integer.MIN_VALUE;
        boolean isLeaf = true;

        for (int neighbor : tree.get(node)) {
            if (neighbor == parent) continue;
            isLeaf = false;
            maxProfit = Math.max(maxProfit, dfsAlice(tree, neighbor, node, time + 1, profit, bobTime, amount));
        }
        return isLeaf ? profit : maxProfit;
    }
}
