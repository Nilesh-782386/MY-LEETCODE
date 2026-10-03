class Solution {
    public int peakIndexInMountainArray(int[] arr) {


      int st = 0 , end = arr.length-1;

      int n = arr.length;
      while( st <= end)  {


        int  mid  = (st+end)/2;

        if(mid+1 <n && mid-1>= 0 &&  arr[mid-1] <  arr[mid] && arr[mid+1] < arr[mid])return mid;  
         if(mid+1 <n && mid-1 >= 0 &&  arr[mid-1] > arr[mid+1] ){
            end  = mid-1;
         }else{
            st = mid+1;
         }

        
      }

      return end-1;
    }
}