class Solution {
    static int first(int arr[], int tar ){
        
        int st = 0;
        int end  =  arr.length-1;
        int ans = -1;
        while( st <= end ){
            int mid = (st +end )/2;
            if(arr[mid] == tar){
                ans = mid;
                end = mid-1;
            }else if( arr[mid] < tar){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return  ans;
    }

      static int last(int arr[], int tar ){
        
        int st = 0;
        int end  =  arr.length-1;
        int ans = -1;
        while( st <= end ){
            int mid = (st +end )/2;
            if(arr[mid] == tar){
                ans = mid;
                st = mid+1;
            }else if( arr[mid] < tar){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return  ans;
    }
    public int[] searchRange(int[] arr, int target) {
        int ans[] =  new int[2];
       int e1  = first( arr, target);
       int e2 = last( arr, target);
       ans[0] = e1;
       ans[1] = e2;
       return ans;
    }
}