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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> a =  new ArrayList<>();

        if( root == null ) return a;
    Queue<TreeNode>q = new  LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){

     int max =Integer.MIN_VALUE;
     int s = q.size();
     for(int i = 0;i<s;i++){
        TreeNode t  = q.poll();
         max =  Math.max(max , t.val);
         
         if( t.left != null )q.add(t.left);
         if( t.right != null )q.add(t.right);

         
     }
     a.add(max);
    }

 return a;
    }
}