class Solution {
    public boolean isMiddleElementUnique(int[] nums) {

     int mid = nums[nums.length/2];

     boolean flag = false;

     for( int i = 0;i<nums.length;i++){

        if(nums[i] == mid && i != (nums.length/2)){
            flag = true;
        }
     }


     return !flag;

    }
}