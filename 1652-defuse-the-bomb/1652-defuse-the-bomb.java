class Solution {
     static   void rev( int arr[]){
        int i = 0;
        int j = arr.length-1;

    while (i <  j ) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
            
        }
    }
    
     public static int[] decrypt(int[] arr, int k) {
      int kk = k;
        if(k < 0 ){
        rev(arr);
        k = -k;
        
       }
       int n = arr.length;
       int pre[]  =   new int[2*n];

       int ans[] = new int[n];

       if(k == 0 ){
        Arrays.fill(ans, 0);
    
       }
      


       
       for( int i = 0;i<2*n;i++){
        pre[i] = arr[i%n];
       }

       

       for(int i = 1;i<pre.length;i++){
        pre[i] += pre[i-1];
       }

       for( int i = 0;i<n;i++){
        ans[i] =  pre[i+k]-pre[i];
       }
    
    if(kk < 0){
        rev(ans);
    }


    return ans;

    }
}