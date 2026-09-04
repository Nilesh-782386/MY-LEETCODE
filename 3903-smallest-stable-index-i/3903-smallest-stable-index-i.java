class Solution {

     int findMax(int arr[] , int st ,int end){
        int max = Integer.MIN_VALUE;
        for(int i = st ; i<= end ;i++){
            max = Math.max( max , arr[i]);
        }
        return max;
     }
      int findMin(int arr[] , int st ,int end){
        int min = Integer.MAX_VALUE;
        for(int i = st ; i<= end ;i++){
            min = Math.min( min , arr[i]);
        }
        return min;
     }
    public int firstStableIndex(int[] arr, int k) {
       
       int n  = arr.length;
        for(int i = 0;i<n;i++){

         int   max = findMax(arr , 0   , i);
         int   min = findMin(arr , i  , n-1);
         if((max-min) <= k) return i;
        }

        return -1;
    }
}