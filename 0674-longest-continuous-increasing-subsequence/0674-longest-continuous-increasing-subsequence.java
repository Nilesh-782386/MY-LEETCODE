class Solution {
    public int findLengthOfLCIS(int[] arr) {

    int prev = arr[0];
    int countCurr = 0;
    int  maxCount = 0;
    if(arr.length == 1) return 1;
    for(int i = 1;i<arr.length;i++){

    int curr = arr[i];
    
    if(prev < curr){
      countCurr++;
              maxCount = Math.max( countCurr+1,maxCount  );
    }else{
        countCurr++;
        maxCount = Math.max( countCurr,maxCount  );
      countCurr = 0;  
    }
    prev  = arr[i];

    }

    return maxCount;
     
    }
}