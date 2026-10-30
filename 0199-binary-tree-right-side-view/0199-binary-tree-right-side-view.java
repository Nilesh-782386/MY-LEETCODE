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

    void helper( TreeNode root , ArrayList<Integer>l ){

        if( root == null) return;
        Queue<TreeNode>q = new LinkedList<>();

        q.add(root);

         while(!q.isEmpty()){

            int size = q.size();
          

            for(int i = 1;i<=size;i++){
             TreeNode top = q.poll();
               if(i == size){
              if(top != null )  l.add(top.val);
               }
               

            if( top.left != null ) q.add(top.left);
            if( top.right != null ) q.add(top.right);
         }
    }
    }
     public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer>l = new ArrayList<>();
        
     helper(root , l);

       return l;
    }
}