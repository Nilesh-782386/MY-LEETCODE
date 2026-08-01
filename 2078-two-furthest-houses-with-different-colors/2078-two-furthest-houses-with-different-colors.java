class Solution {
    public int maxDistance(int[] arr) {
        

     int i = 0;
     int j = arr.length-1;

     while(arr[i] == arr[j]){
        j--;
     }
     
     int a1 = j-i;
     i = 0;
     j = arr.length-1;
      while(arr[i] == arr[j]){
        i++;
     }
     int a2 = j-i;


     return Math.max( a1 , a2);
    }
}