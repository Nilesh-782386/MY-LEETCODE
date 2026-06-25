class Solution {

  boolean isPrime( int n ){
       if(n == 1) return false;
       if( n == 2 ) return true;
        for( int i = 2;i*i<=n;i++){
            if(n%i == 0 ) return false;
        }
        return true;  
  }

  void  checkDivide(int n , int arr[]){



     for( int i = 1;i<=n/2;i++){
            if(n%i == 0 ){
arr[0]+=i;
            }
        }
  }


    public boolean checkPerfectNumber(int num) {

        int arr[] = new int[1];
        if(isPrime(num))return  false;
        if(num%2  != 0 ) return false;

        checkDivide(num  , arr);

        if(arr[0] ==  num && !isPrime(num)) return  true;

        return false;
    }
}