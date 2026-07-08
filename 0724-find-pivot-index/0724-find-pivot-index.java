class Solution {
    public int pivotIndex(int[] arr) {

    int n = arr.length;

    int fl = 0;
    
    for( int i = 1;i<n;i++){
        fl += arr[i];
    }
    if(fl == 0 ) return 0;
    for( int i = 1;i<n;i++){
        arr[i] +=arr[i-1];
    }
    

    int tot = arr[n-1];
   

    for( int i = 1;i<n;i++){
        if(arr[i-1] == tot-arr[i])return i ;
    }

    return -1;
    }
}