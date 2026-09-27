class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
     
      int min = Integer.MAX_VALUE;
      for(int  i = 0;i<nums.length;i++){
        int xor  = 0;
        for(int  j = i;j<nums.length;j++){

           xor    = xor|nums[j];
           if(xor >=    k)   min = Math.min( min , j-i+1);    
        }
    
        }
        if(min ==  Integer.MAX_VALUE) return -1;

        return min;

        
    }
}