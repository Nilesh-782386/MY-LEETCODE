class Solution {
    public int longestOnes(int[] arr, int k) {
        
        int countZero = 0;

        int i =  0;
        int j = 0;
         int  max = 0;

        int n = arr.length;

        while( j < n){

          
          if(arr[j] == 0 ){
            countZero++;
          }

      if(countZero <= k){

         max = Math.max( max , j-i+1);
      }else{

        while(i < arr.length &&   countZero > k ){
           
           if(arr[i] == 0 ){
            countZero--;
           }
            i++;
        }
      }
      j++;
        }

        return max;
    }
}