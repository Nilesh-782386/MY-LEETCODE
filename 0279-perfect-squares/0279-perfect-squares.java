class Solution {
    // boolean isPerfect( int n , int tot  , int arr[] ){

    //     int  sq = (int) Math.sqrt(n);

    //     return sq*sq == n;
    // }

    int help( int n , int tot  , int arr[] ,int dp[][]){

   if(tot == 0 )return  0;
   if(tot  < 0  || n < 0 ) return (int)1e9;


   if(dp[n][tot] != -1) return dp[n][tot];
   int take = help(n  , tot-arr[n], arr , dp );
   int notTake = help( n-1 ,tot , arr , dp);


    return dp[n][tot] = Math.min( take+1 , notTake);
    }

    public int numSquares(int n) {

      int count = 0;
    for(int  i = 1;i*i<= n;i++){
         count++;
    }

    int arr[] = new int[count];
     int  k = 0;
    
   for(int  i = 1;i*i<= n;i++){
        arr[k++] = i*i;
    }
     int dp[][] = new int[arr.length][n+1];

     for(int i = 0;i<arr.length;i++){
        for(int j = 0;j<n+1;j++){
             dp[i][j] = -1;
        }
     }

     return help(arr.length-1 ,  n ,  arr ,  dp);

    }
}