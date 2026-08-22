class Solution {
    int  sum( int n ){
        int k = 0;
        int p = 1;


        while(n  > 0){
            k += n%10;
            p *= n%10;
            n = n/10;
            
        }
        
        return k+p;
    }
    public boolean checkDivisibility(int n) {

     return    n%sum(n)==0;
    }
}