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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;

        int left=Depth(root.left);
        int right=Depth(root.right);
        int bal=Math.abs(left-right);
        if(bal>1)
        {
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
        
    }
    public int Depth(TreeNode root)
    {
        if(root==null) return 0;
        int left=Depth(root.left);
        int right=Depth(root.right);

        return Math.max(left,right)+1;

    }
}