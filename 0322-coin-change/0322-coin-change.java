
class Solution {

    public int coinChange(int[] arr, int amt) {

        int n = arr.length;
        int INF = (int) 1e9;

        int dp[][] = new int[n + 1][amt + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int j = 1; j <= amt; j++) {
            dp[0][j] = INF;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amt; j++) {

                if (arr[i - 1] <= j) {

                    int take = 1 + dp[i][j - arr[i - 1]];
                    int notTake = dp[i - 1][j];

                    dp[i][j] = Math.min(take, notTake);

                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][amt] >= INF ? -1 : dp[n][amt];
    }
}
