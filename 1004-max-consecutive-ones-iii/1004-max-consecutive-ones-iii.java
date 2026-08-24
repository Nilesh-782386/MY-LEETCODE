class Solution {
    public int longestOnes(int[] arr, int k) {



       int i = 0;
       int j = 0;
       int n = arr.length;
       int zero =0;
       int max = 0;
       if(k==n) return n;
       while( j <n ){

        if(arr[j] == 0){
            zero++;
        }

      
       
        if(zero <= k ){
         max = Math.max( max , j-i+1);
          }
        while(i<=j && zero  > k ){
            //  max = Math.max( max , j-i);
           
            if(arr[i] == 0){
                zero--;
            }
            i++;
        }
            
j++;
       }

     return  max;
    }
}