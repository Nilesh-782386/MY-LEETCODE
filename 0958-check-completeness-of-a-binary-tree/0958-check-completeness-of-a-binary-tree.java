class Solution {

    int size(TreeNode root){

        if(root == null)return 0;


        return 1+size(root.left)+size(root.right);
    }

     boolean help( TreeNode root , int idx , int s){
         
        if(root == null) return true;
        if(idx > s ) return false;

       return   help(root.left , 2*idx , s) && help( root.right , 2*idx+1 , s);
     }
    public boolean isCompleteTree(TreeNode root) {

    int s = size( root);


    return  help(root , 1 ,s);
    }

}