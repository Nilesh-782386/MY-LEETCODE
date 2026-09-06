class Solution {
    public int firstStableIndex(int[] arr, int k) {

        int n = arr.length;
        int max = arr[0];
        int min = arr[n-1];

        int maxArr[] =  new int[n];
        int minArr[] =  new int[n];

        for(int i = 0;i<n;i++){

            if(max < arr[i]){
               max = arr[i];
            }
            maxArr[i] =  max;

        }

        for(int i = n-1;i>=0 ;i--){

          if(min    > arr[i]){
               min = arr[i];
            }
            minArr[i] =  min;

        }

        for( int  i =0;i<n;i++){
         if(Math.abs(minArr[i]-maxArr[i])  <= k ) return i ;
        } 
        
        return -1;
    }
}