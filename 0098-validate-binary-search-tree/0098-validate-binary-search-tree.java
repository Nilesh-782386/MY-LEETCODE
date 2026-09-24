class Solution {

    boolean help(TreeNode root , long st , long end){
        if(root == null) return true;

        if(root.val <= st || root.val >= end){
            return false;
        }

        return help(root.left , st , root.val) &&
               help(root.right , root.val , end);
    }

    public boolean isValidBST(TreeNode root) {
        return help(root , Long.MIN_VALUE , Long.MAX_VALUE);
    }
}