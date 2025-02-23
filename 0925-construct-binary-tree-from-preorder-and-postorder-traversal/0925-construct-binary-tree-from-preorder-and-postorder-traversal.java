import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

class Solution {
    int preIndex = 0;
    
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return buildTree(preorder, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] postorder, int left, int right) {
        if (left > right || preIndex >= preorder.length) return null;
                TreeNode root = new TreeNode(preorder[preIndex++]);
                if (left == right) return root;
                int index = left;
        while (postorder[index] != preorder[preIndex]) index++;
                root.left = buildTree(preorder, postorder, left, index);
        root.right = buildTree(preorder, postorder, index + 1, right - 1);
        
        return root;
    }
}
