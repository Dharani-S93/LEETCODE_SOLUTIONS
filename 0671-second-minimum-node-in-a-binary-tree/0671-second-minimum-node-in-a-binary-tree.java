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
    public int findSecondMinimumValue(TreeNode root) {
        if (root.left == null) return -1; 
        int left, right;
        if (root.left.val == root.val) {
            left = findSecondMinimumValue(root.left);
        } else {
            left = root.left.val;
        }
        if (root.right.val == root.val) {
            right = findSecondMinimumValue(root.right);
        } else {
            right = root.right.val;
        }
        if (left == -1) return right;
        if (right == -1) return left;
        return Math.min(left, right);
    }
}
