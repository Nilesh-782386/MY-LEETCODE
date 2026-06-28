
class Solution {

    TreeNode help(TreeNode root1 , TreeNode root2 ){

        
        if(root1 == null && root2 != null ) return root2;
        if(root1 != null && root2 == null ) return root1;
        if( root1 == null || root2 == null) return null;
        TreeNode n = new TreeNode(root1.val+root2.val);

        n.left  = help(root1.left ,  root2.left);
        n.right  = help(root1.right , root2.right);


        return n ;
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {


        return help(root1 ,root2 ); 
    }
}