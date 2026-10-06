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
     int  min = Integer.MIN_VALUE;
     int max  = Integer.MAX_VALUE;

     TreeNode  help(int arr[] , int st , int end ){

         
        int mid = (st+end)/2;
        int num = arr[mid];

           if(st > end ) return null;
        TreeNode t = new TreeNode(num);

        t.left = help( arr , st , mid-1);
        t.right = help( arr , mid+1 , end);

        return t;
        
     }
    public TreeNode sortedArrayToBST(int[] nums) {
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
        
        return help(nums, 0  , nums.length-1);
    }
}