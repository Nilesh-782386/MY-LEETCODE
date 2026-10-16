class Solution {
    public int maximalSquare(char[][] arr) {

       int max = 0;
     boolean  flag = false;
       for(int i = 0;i<arr.length;i++){
        for(int j = 0;j<arr[0].length;j++){
          
          if(arr[i][j] == '1') flag = true;
        if(arr[i][j] == '0' || i-1 < 0 || j-1 < 0 ) continue;

          
          int n1 = (int)(arr[i-1][j]-'0');
          int n2 = (int)(arr[i-1][j-1]-'0');
          int n3 = (int)(arr[i][j-1]-'0');
          
          
          int k  =   1+Math.min(n1 , Math.min( n2,n3 ));
          arr[i][j] = (char)(k+'0');
           max = Math.max(k  , max);
        }

       }



      if( max > 1) return max*max;

      if( flag && max == 0 ) return 1;

      return max*max;

    }
}