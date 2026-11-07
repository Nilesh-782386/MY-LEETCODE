
class Solution {

    int totMax= 0;
    
    int max( TreeNode root){
        if(root== null) return 0;

        int l = max(root.left);
        int r = max(root.right);

        totMax = Math.max(l+r ,totMax );

        return  1+Math.max(l , r);

        
    }
    public int diameterOfBinaryTree(TreeNode root) {


      max( root);

      return  totMax; 
    }
}