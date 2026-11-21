class Solution {
    public int minMoves(int[] arr) {

     int min  = arr[0];
     int tot = 0;

     for( int   i : arr){
       min = Math.min(i , min);
     }

     for( int j : arr){
     tot += ( j-min);
     }

     return tot;
    }
}