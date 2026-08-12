class Solution {
   static  int tot(int  n){
        int k = 0;

        while (n > 0 ) {
            k++;
            n = n/10;
        }
        return k;
    }

    static  void rev( int arr[]){
        int i = 0, j = arr.length-1;

        while (i < j) {
            
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
     public  static  int  divisorSubstrings(int num, int k) {
        
        int ans = 0;
    
        int s = tot(num);
        int arr[] = new int[s];

         insert( arr , num);

rev(arr);


for( int i = 0;i<arr.length-k+1;i++){
    int t = 0;
    for( int j = i;j<=i+k-1;j++){
        t = t*10+arr[j];
    }
    if(t == 0)continue;
    if(num%t == 0)ans++;
}

        return ans;
     
    }

    static  void insert(int[] arr, int n) {
        
       
         int t =0;
        while (n > 0 ) {
           int k =   n%10;
            arr[t++] = k;
            n = n/10;
        }
    }
}