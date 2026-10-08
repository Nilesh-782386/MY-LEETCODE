class Solution {
    public int threeSumClosest(int[] arr, int tar) {
        

         List<List<Integer>>aa  = new ArrayList<>(); 
      
      int diff = Integer.MAX_VALUE;
      int ans  =  0;
      Arrays.sort(arr);    
      
      for(int i = 0;i<arr.length;i++){

    if(i != 0 && arr[i-1] == arr[i]) continue;

    int st = i+1;
    int end = arr.length-1;
     while( st < end){
      int sum =  arr[i]+arr[st]+arr[end];

         if(Math.abs(sum-tar) <  diff ){
          diff =  Math.abs(sum-tar);

          ans  = sum;
        
        //   st++;
        //   end--;
        // while( st < end  && arr[st] == arr[st-1])st++;
        // while( st < end  && arr[end] == arr[end+1])end--;
         }
      
        
        if( sum  < tar ){

        st++;
      }else{
        end--;
      }
     }

      }

      return ans;
       
    }
}