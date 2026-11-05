class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

     HashSet<Integer>h =  new HashSet<>();

     for(int I : arr2){
        h.add(I);
     }

     int count = 0;

     int  k = 0;

     
     for(int i = 0;i<arr1.length;i++){
        k = 0;
        for(int j = 0;j<arr2.length;j++){

          if(Math.abs(arr1[i]-arr2[j]) > d) k++;
        }
        if( k == arr2.length) count++;
     }

     return count;

    }
}