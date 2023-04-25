package leetcode.easy;

public class easy_104 {
    
 //Definition for a binary tree node.
 public class TreeNode {
    int val;
     public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
 }
 
    public int maxDepth(TreeNode root) {
    if (root == null) {
    return 0; // base case: an empty tree has depth 0
    } else {
    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);
    return 1 + Math.max(leftDepth, rightDepth); // recursive case: the depth is 1 plus the maximum depth of the left and right subtrees
    }
    }
    }

