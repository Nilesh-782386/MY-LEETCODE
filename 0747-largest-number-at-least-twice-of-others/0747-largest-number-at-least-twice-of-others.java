class Solution {
    public int dominantIndex(int[] arr) {

     int max = 0;
     int idx = 0;

     for( int i = 0;i<arr.length;i++){

        if(max < arr[i]){
            max = arr[i];
            idx = i;
        }
     }

     for( int i = 0;i<arr.length;i++){

        if( arr[i] != max &&  (arr[i] *2)>  max  )  return -1;
     }

     return idx;


    }
}