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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        solve(root,null , target,false);
        if(root.left==null && root.right==null && root.val==target)
        {
            return null;
        }
        return root;
    }
    private void solve(TreeNode root,TreeNode parent,int target,boolean isLeft)
    {
        if(root==null)
        return ;
        solve(root.left ,root,target,true);
        solve(root.right,root,target,false);

        if(root.left==null && root.right==null && root.val==target)
        {
            if(parent==null) 
            return;
            if(isLeft) parent.left=null;
            else parent.right=null;
        } 
    }
}