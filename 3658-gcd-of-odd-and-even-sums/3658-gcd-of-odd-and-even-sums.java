class Solution {
    int gcd( int x , int y){
        if(x == 0 ) return y;


        return gcd(y%x,  x);
    }
    public int gcdOfOddEvenSums(int n) {

     int sumEven = n*(n+1);   
     int sumOdd =  n*n; 

    return gcd(sumEven , sumOdd);

    }
}