
class Solution {

    void help (ArrayList<String>ll , TreeNode root  ,String s){

        if(root  == null) return ;

        s += root.val+"->";

        if(root.left == null && root.right == null){
            
             s = s.substring(0, s.length() - 2);
            ll.add(s);
            // sb.setLength(0);
            return;
        }
        help(ll , root.left , s);
        help(ll , root.right , s);
    }
    public List<String> binaryTreePaths(TreeNode root) {

      ArrayList<String>ll = new ArrayList<>(); 
      help(ll , root , new String());

     return ll;


    }
}