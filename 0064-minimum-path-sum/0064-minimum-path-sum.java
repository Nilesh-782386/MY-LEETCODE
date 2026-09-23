class Solution {
    public int minPathSum(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
    int ans[][] = new int[n][m];

    ans[0][0] =  grid[0][0];


    for( int i = 1;i<n;i++){
     ans[i][0] = grid[i][0]+ans[i-1][0];
    }
      for( int j = 1;j<m;j++){
         ans[0][j] = grid[0][j]+ans[0][j-1];

        }

        for( int i = 1;i<n;i++){
            for( int j = 1;j<m;j++){

                ans[i][j] = grid[i][j]+ Math.min( ans[i-1 ][j] , ans[i][j-1]);
            }
        }


    return ans[n-1][m-1];

    }
}