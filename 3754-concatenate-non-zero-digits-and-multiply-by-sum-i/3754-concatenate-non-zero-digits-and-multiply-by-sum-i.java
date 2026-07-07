class Solution {

   int   sumOfNumber(int n ){

    int  sum = 0;

    while(n > 0 ){
        sum += n%10;
        n = n/10;
    }

    return sum;
   }
   int   reverse(int n ){

    int  rev = 0;

    while(n > 0 ){
    
        int k = n%10;
        if( k!= 0){

            rev = rev*10+k;
        }

        n = n/10;

    }

    return rev;
   }

   
    public long sumAndMultiply(int n) {

    int sum  = sumOfNumber(n);
    int rev = reverse(n);
    int mRev = reverse(rev);

    return (long)sum*mRev;

    }
}