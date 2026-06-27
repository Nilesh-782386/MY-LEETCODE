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
     int max = Integer.MIN_VALUE;
    int height(TreeNode root){
        if( root == null) return 0;

        return 1 + Math.max( height(root.left ) , height(root.right));
    }
    int maxx(TreeNode root , int i){
        if( root == null) return 0;
      
        if(i  == 1){
        max = Math.max( max , root.val);
        //  return max ;
        }
        maxx( root.left , i-1);
        maxx( root.right , i-1);
        return max;
    }
    public List<Integer> largestValues(TreeNode root) {
List<Integer>a =  new ArrayList<>();
      int n =  height(root);
      for( int i = 1;i<=n;i++){
        max =Integer.MIN_VALUE;
        int num = maxx(root , i );
        a.add(num);
      }
      return a;
    }
}