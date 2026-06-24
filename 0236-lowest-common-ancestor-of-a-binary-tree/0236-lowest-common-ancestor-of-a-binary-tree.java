/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
     boolean isPresent( TreeNode root ,  TreeNode n1){
       if(root == null ) return false;
       if(root == n1) return true;
       return isPresent( root.left , n1) || isPresent(root.right , n1);
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
        
    //  if( root == null ) return root ;
     if((root == n1)  || (root == n2)) return root;
     if( n1 == n2) return n1;
    
     boolean lf = isPresent(root.left , n1);
     boolean rf = isPresent(root.right , n2);
        if( (lf ==true)  && (rf == true) || (lf !=true)  && (rf != true) )  return root;
        if( (lf ==true)  && (rf != true) )  return lowestCommonAncestor(root.left , n1, n2);
        if( (lf != true)  && (rf == true) )  return lowestCommonAncestor(root.right , n1, n2);
      
        return null;
    
    }

}