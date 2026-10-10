
class Solution {

    int help(int n, int m, String s1, String s2 , int dp[][]) {

        if (n < 0 || m < 0) return 0;

        if(dp[n][m] != -1)return dp[n][m];

        if (s1.charAt(n) == s2.charAt(m)) {
            return dp[n][m]= 1 + help(n - 1, m - 1, s1, s2 , dp);
        } else {
            int fs = help(n - 1, m, s1, s2  , dp);
            int ss = help(n, m - 1, s1, s2 , dp );

            return  dp[n][m] = Math.max(fs, ss);
        }
    }

    public int longestCommonSubsequence(String text1, String text2) {


        int dp[][] = new int[text1.length()+1][text2.length()+1];
        int n = text1.length() - 1;
        int m = text2.length() - 1;


        for( int i = 0;i<text1.length()+1;i++){

            for( int j = 0;j<text2.length()+1;j++){

                dp[i][j] = -1;
            }
        }

        return help(n, m, text1, text2 , dp);
    }
}