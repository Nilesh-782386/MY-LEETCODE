class Solution {
     int  product(int n){
        int k = 1;

        while( n > 0 ){
            k = k*(n%10);
            n = n/10;
        }

        return k;
     }
    public int smallestNumber(int n, int t) {

        
        for( int i = n;i<= 100;i++){
            if(product(i)%t == 0) return i;
        }
        
        return -1;
    }
}