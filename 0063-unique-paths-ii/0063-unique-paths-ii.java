class Solution {

    int help( int r , int c , int n , int  m , int arr[][] ,int done[][]){

      if(n  >= r || m >= c || arr[n][m] ==1) return 0;
      if(n == r-1 && m == c-1 )  return 1;
       if(done[n][m] != -1 ) return done[n][m];
      int down =  help(r , c , n+1 , m , arr , done);
      int right = help(r , c , n , m+1 , arr , done);

      return  done[n][m] = down+right;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

      int r =   obstacleGrid.length; 
      int c  =   obstacleGrid[0].length; 

      int done[][]  =  new int[r][c];

    for( int i = 0;i<r;i++){
        for( int j = 0;j<c;j++){
            done[i][j] = -1;
        }
    }
      return  help(r , c ,  0 , 0  , obstacleGrid , done );
    }
}