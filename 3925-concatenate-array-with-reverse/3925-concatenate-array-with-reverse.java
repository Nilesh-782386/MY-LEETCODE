class Solution {
    public int[] concatWithReverse(int[] nums) {

   int ans[] = new int[2*nums.length];
      for( int i =0;i<2*nums.length;i++){
      
      if( i < nums.length){
        ans[i] = nums[i];
      }else{
       ans[i] = nums[2*nums.length-i-1];
      }
      }

      return ans;
    }
}