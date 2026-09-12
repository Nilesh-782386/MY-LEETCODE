class Solution {
    public boolean kLengthApart(int[] arr, int k ) {
    

    int i = 0;
    int j = 0;
    int n =  arr.length;
    while( i < n && arr[i] != 1 )i++;
    j = i+1;
    while( j < n && arr[j] != 1 )j++;

    while( j  < n ){

        if(j-i-1  < k ) {
            return false;
        }else{
         i = j;
         j++;
         while( j < n && arr[j] != 1 )j++;
        }


    }

    return true;
    
     }
}
