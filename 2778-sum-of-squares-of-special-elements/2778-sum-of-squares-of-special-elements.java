class Solution {
    public int sumOfSquares(int[] arr) {

     int tot = 0;


     for( int i = 0;i<arr.length;i++){

        if(arr.length%(i+1) == 0 ){
            tot += arr[i]*arr[i];
        }
     }

     return tot;
        
    }
}