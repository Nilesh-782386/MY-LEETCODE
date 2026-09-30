class Solution {

     int help(int  n  , int arr[] , int totAmt , int ans[][]){

         if(totAmt == 0 ) return 0;
        if(n < 0 || totAmt < 0 )return (int)1e9;

       if(ans[n][totAmt] != -1)  return ans[n][totAmt];

         int take = help(n , arr ,  totAmt-arr[n]  , ans);
         int NotTake = help(n-1, arr ,  totAmt ,  ans);

         return ans[n][totAmt] = Math.min( 1 + take , NotTake);
     }
    public int coinChange(int[] arr, int amt ) {
        
   int n = arr.length;

     int ans[][] = new int[n+1][amt+1];
     for(int i  = 0;i<n+1;i++){

        for(int j = 0;j<amt+1;j++){
            ans[i][j] = -1;
        }
     }
    int a =  help(n-1 ,  arr , amt , ans);

    if( a == (int)1e9) return  -1;

    return a;
    }
}