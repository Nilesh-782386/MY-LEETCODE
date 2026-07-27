class Solution {
    public int maxProduct(int[] arr) {
    
    int k = 0;
    int f = Integer.MIN_VALUE;
    int s = Integer.MIN_VALUE;
    int t = Integer.MIN_VALUE;


for( int i =0;i<arr.length;i++ ){
     f = Math.max( f , arr[i]);
}

    for(int i =0;i<arr.length;i++){

       
        if(f == arr[i]){
            k++;
        s = Math.max(s ,arr[i]);

        }
        
        if(arr[i] != f){
        t = Math.max( t , arr[i]);
        }

    }

    if(k > 1 )return (f-1)*(s-1);


    return (f-1)*(t-1);
        
    }
}