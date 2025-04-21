/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return Sum(root,targetSum,0);
    }

    private boolean Sum(TreeNode node, int targetSum, int sum){
        if(node==null)
        return false;
        sum+=node.val;
        if(node.left == null && node.right==null){
            return sum==targetSum;
        }
        return Sum(node.left, targetSum , sum) || Sum(node.right , targetSum,sum);

    }
}