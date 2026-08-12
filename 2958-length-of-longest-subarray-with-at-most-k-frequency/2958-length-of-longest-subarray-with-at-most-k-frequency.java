class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
        
    HashMap<Integer, Integer>hm = new HashMap<>();

     int i = 0 , j = 0;
     int n = arr.length;
     int longestSub = 0;

     while(j< n){


        if(hm.containsKey(arr[j])){
         hm.put(arr[j] , hm.get(arr[j]) +1); 
        }else{
            hm.put( arr[j] , 1);
        }

           while (i < j && hm.get(arr[j]) > k){
          hm.put(arr[i] , hm.get(arr[i]) -1); 
       
           i++;
            }
                longestSub = Math.max( longestSub , j-i+1) ;
    
        j++;

     }

     return longestSub;

    }
}
