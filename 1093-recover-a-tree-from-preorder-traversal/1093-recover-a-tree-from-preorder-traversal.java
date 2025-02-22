import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { 
        this.val = val; 
    }
}
class Solution {
    int index = 0;
    public TreeNode recoverFromPreorder(String traversal) {
        return helper(traversal, 0);
    }
    private TreeNode helper(String s, int depth) {
        int numDashes = 0;
        while (index < s.length() && s.charAt(index) == '-') {
            numDashes++;
            index++;
        }
        if (numDashes != depth) {
            index -= numDashes;
            return null;
        }
        int numStart = index;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            index++;
        }
        int value = Integer.parseInt(s.substring(numStart, index));
        TreeNode node = new TreeNode(value);
        node.left = helper(s, depth + 1);
        node.right = helper(s, depth + 1);
        return node;
    }
}
