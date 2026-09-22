class Solution {

    int help(int   m  , int  n  , int r , int c , int arr[][]  ){

        if(   r >= m  || c >= n  ) return  0 ;
        
        if( r == m-1 && c == n-1 ) return 1;

        if( arr[r][c] !=  -1 ) return arr[r][c];
        int down =  help(  m ,n , r+1 , c , arr);
        int right = help( m , n ,r  , c+1 , arr);
        return arr[r][c]  = down+right;
    } 
    public int uniquePaths(int m, int n) {

    int arr[][]  =  new int[m][n];

    for( int i = 0;i<m;i++){
        for( int j = 0;j<n;j++){
            arr[i][j] = -1;
        }
    }
    return help(  m, n  , 0 ,  0 , arr  );
    }
}