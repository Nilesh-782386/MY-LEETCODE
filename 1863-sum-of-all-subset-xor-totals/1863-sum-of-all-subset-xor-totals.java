class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int len = 1<<n;
        int xor = 0;
        int sum   = 0;
        for(int i =0;i<len;i++){
             xor= 0;
            for( int j = 0;j< n;j++){
                int k = i>>j;
                if(k%2 != 0){
                xor = xor^nums[j];
                }
            }
            sum += xor;
        }

        return sum;
    }
}