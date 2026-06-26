
class Solution {
     int  min = Integer.MAX_VALUE;
     Integer prev = null;
    public int minDiffInBST(TreeNode root) {


      if( root == null )return 0;

      minDiffInBST(root.left);
     if( prev != null ) min = Math.min( min , root.val-prev );

      prev = root.val;
       minDiffInBST(root.right);

       return min;

    }
}