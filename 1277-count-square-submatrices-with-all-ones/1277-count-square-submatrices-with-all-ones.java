class Solution {
    public int countSquares(int[][] arr) {


       int tot = 0;

       for(int i = 1;i<arr.length;i++){
        for(int j = 1;j<arr[0].length;j++){
          
        if(arr[i][j] == 0 || i-1 < 0 || j-1 < 0 ) continue;
         arr[i][j] =  1+Math.min(arr[i-1][j] ,  Math.min( arr[i-1][j-1] , arr[i][j-1] ));

        }

       }

       for(int i = 0;i<arr.length;i++){
        for(int j = 0;j<arr[0].length;j++){
          
          tot += arr[i][j];

       
        }

        }
        return tot;
    }
}