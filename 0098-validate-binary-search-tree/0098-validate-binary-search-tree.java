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
      long   min = Long.MIN_VALUE;
      long  max  =   Long.MAX_VALUE;

 boolean   help( TreeNode root ,  long  minV , long  maxV){

    if(root ==  null) return true;

     if(root.val >= maxV || root.val <= minV ) return   false;

     return help(root.left , minV , root.val) && help( root.right , root.val  , maxV);


     }
     
    public boolean isValidBST(TreeNode root) {
        if(root == null  ) return true;
        min = Long.MIN_VALUE;
        max  = Long.MAX_VALUE;
        return help(root  , min , max);
    }
}