class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

     int i = 0 , j  = 0;

     int currSum = 0;
     int count = 0;
    while( j < arr.length){


        currSum += arr[j];

        
        if( (j-i+1 == k)  ){
            
           if( ((currSum)/(j-i+1)) >= threshold) count++;

            currSum -= arr[i];
            i++;

        }
        j++;
    } 

    return count;    
    }
}