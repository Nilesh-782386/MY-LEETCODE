class Solution {

    boolean help(int  n, int arr[] ,  int tot , int dp[][]){

        if( tot == 0 ) return true;


        if(tot < 0 ||   n< 0 ) return  false;

     if(dp[n][tot] == 1 ){
      return true;  
     }
      if(dp[n][tot] == 0 ){
      return false;  
     }
        boolean take = help( n-1 , arr,  tot-arr[n]  , dp);
        boolean notTake = help( n-1 , arr,  tot ,dp);
        if(take|| notTake){
            dp[n][tot] = 1;
        }else{
          dp[n][tot] =  0;  
        }

        return take|| notTake;
    }
    public boolean canPartition(int[] nums) {

      int  sum =  Arrays.stream(nums).sum();
      if(sum% 2 != 0 )return false;
      
      int dp[][] =  new int[nums.length+1][(sum/2)+1];

      for( int i = 0;i<nums.length+1;i++){
        for( int j = 0;j<(sum/2)+1;j++){
            dp[i][j]  = -1;
        }
      }
     
     return help(nums.length-1 ,  nums , sum/2 , dp );
      
    }
}