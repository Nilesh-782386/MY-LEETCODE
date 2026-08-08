class Solution {
    public int maxProductDifference(int[] nums) {


      int max1 = Integer.MIN_VALUE;  
      int max2= Integer.MIN_VALUE;  
      int min1 = Integer.MAX_VALUE;  
      int min2 = Integer.MAX_VALUE;

      HashMap<Integer, Integer>h = new HashMap<>();

      for( int i : nums){
        if(h.containsKey(i)){
            h.put( i , h.get(i)+1);
        }else{
              h.put( i , 1);
        }
      }

      int k = 0;
      for(int i = 1;i<nums.length;i++){
        if(nums[i-1] == nums[i])k++;
      }
      if(k == nums.length-1) return 0;

      for( int i   : nums){

        max1  = Math.max( max1 , i);
      }
      
      for( int i   : nums){

     if(i != max1 ) {
        
          max2  = Math.max( max2 , i);
     }else{
        if( max1 == i  && h.get(i)  >  1){
          max2  = Math.max( max2 , i);
     } 
     }
      }


      for( int i   : nums){

        min1 = Math.min( min1 , i);
      }
      
      for( int i   : nums){

      if(i != min1 )   {
         min2  = Math.min( min2 , i);
     }else{

       if( i == min1 &&  h.get(i) >  1){
         min2  = Math.min( min2 , i);
       }
     }
      }
      

 return  (max1*max2) - (min1*min2);
    }
}