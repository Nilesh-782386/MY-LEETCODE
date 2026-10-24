class Solution {

     int product( int n ){

        int k = 1;

        while( n > 0){
            k = k* (n%10);
            n = n/10;
        }
        return k;
     }

     int sum( int n ){

        int k = 0;

        while( n > 0){
            k+= n%10;
            n = n/10;
        }
        return k;
     }
    public int subtractProductAndSum(int n) {


     
     return product(n)-sum(n);
    }
}