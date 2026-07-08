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
    List<Integer>arr=new ArrayList<>();
    public int countNodes(TreeNode root) {
        if(root==null)
        {
            return arr.size();
        }
        countNodes(root.left);
        arr.add(root.val);
        countNodes(root.right);
        return arr.size();

        
    }
}