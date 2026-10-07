class Solution {
      int help( int arr[] , int idx ,  int  buy , int tran   , int dp[][][]){


        if( tran == 0 || idx >= arr.length) return  0;

   if(dp[idx][buy][tran]  != -1 ) return dp[idx][buy][tran];

        if( buy == 1){

        int buyStock =  -arr[idx] + help(arr , idx+1 , 0 , tran   , dp);
        int notBuyStock =  help(arr , idx+1 , 1 , tran , dp);

         return  dp[idx][buy][tran]= Math.max(buyStock ,  notBuyStock  );

        }else{

        int cellStock =   arr[idx] + help(arr , idx+1 , 1 , tran-1  , dp);
        int notcellStock =  help(arr , idx+1 , 0 , tran   , dp);
        
        return  dp[idx][buy][tran] = Math.max(cellStock ,notcellStock    );

        }
      }
    public int maxProfit(int[] prices) {

     int dp[][][]  = new int[prices.length+1][2][3];
     
     for( int i = 0;i<=prices.length;i++){
        for(int j = 0;j<=1;j++){
            for(int k = 0;k<=2;k++){
            dp[i][j][k] = -1;
            }
        }
     }

      
       return  help(prices ,  0 , 1 , 2  , dp);
    }
}