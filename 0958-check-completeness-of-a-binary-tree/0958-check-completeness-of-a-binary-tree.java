class Solution {
    public boolean isCompleteTree(TreeNode root) {


    boolean  flag = false;

     Queue<TreeNode>q =  new LinkedList<>();

     q.add(root);


      while( !q.isEmpty()){

        TreeNode top = q.poll();

 
     

      if(top.left ==  null || top.left == null )  flag = true;
      else if( flag == true )return false;
      else    q.add(top.left);
 


      if(top.right ==  null || top.right == null )  flag = true;
      else if( flag == true )return false;
      else   q.add(top.right);






      }


    return true;

    }

}