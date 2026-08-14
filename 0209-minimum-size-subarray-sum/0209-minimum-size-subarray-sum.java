class Solution {
    public int minSubArrayLen(int k , int[] arr) {
        

        int n = arr.length;
        int min =  n+1;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j < n ){

         
            sum = sum+arr[j];

           if( sum >= k){
            while(i <= j && sum >= k ){
                if( sum >= k){
                     min = Math.min( min  , j-i+1);
            
                }
                sum = sum-arr[i];
                i++;
           
            }
           
           }
           
          
           j++;



        }

        return  min==n+1?0:min;
        
    }
}
