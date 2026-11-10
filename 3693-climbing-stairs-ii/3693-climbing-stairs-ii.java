class Solution {

    int ans(int n, int arr[], int idx , int dp[]) {

        if(idx > n) return 999999;
        if(idx == n) return 0;

        if(dp[idx] != -1 ) return dp[idx];

        int first = (int)1e9;
        int second = (int)1e9;
        int third = (int)1e9;

        if(idx<= n-1) first = arr[idx] + 1 + ans(n, arr, idx+1 , dp );
       if(idx+1 <= n-1 )   second= arr[idx+1] + 4 + ans(n, arr, idx+2 , dp);
       if(idx+2 <= n-1 )  third = arr[idx+2] + 9 + ans(n, arr, idx+3 , dp);

        return  dp[idx] = Math.min(first, Math.min(second, third));
    }

    public int climbStairs(int n, int[] costs) {

         int dp[]  = new int[n+1];

         Arrays.fill(dp  , -1);

         return ans(n, costs, 0 ,  dp );
    }
}