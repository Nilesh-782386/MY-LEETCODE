class Solution {
    public int findCenter(int[][] arr) {

       int n = arr.length;
       int en[] = new int[n+2];
     for(int i = 0;i<arr.length;i++){
        int a = arr[i][0];
        int b = arr[i][1];
        en[b]++;
        en[a]++;
        
     } 

     int max = 0;
      int k = 0;
     for( int  i = 0;i<en.length;i++){
    if(en[i] > max){
        max = en[i];
        k = i;
    }
    
     }
     return  k;

    }
}