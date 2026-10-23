class Solution {

     int  help( int idx , int amt ,  int arr[] , int dp[][]){

        if(amt == 0 ){
            return 1;
        }

        if(amt < 0 ||  idx == arr.length) return 0;

        if(dp[idx][amt] != -1) return dp[idx][amt];
        int take = help(idx , amt-arr[idx] , arr , dp);
        int notTake = help(idx+1 , amt , arr , dp);

        return dp[idx][amt] =  take+notTake;
     }
    public int change(int amount, int[] coins) {
        
        int dp[][]  = new int[coins.length+1][amount+1];

        for( int i = 0;i<= coins.length;i++){

            for( int j = 0;j<= amount;j++){
             dp[i][j] = -1;   
            }
        }

        return help( 0 ,  amount , coins , dp );
    }
}