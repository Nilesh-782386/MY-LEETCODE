class Solution {
    
    int   sumOfNumber(int n ){

    int  sum = 0;

    while(n > 0 ){
        sum += n%10;
        n = n/10;
    }

    return sum;

    }
    public int getLucky(String s, int k) {
    
      int sum = 0;
      int endSum = 0;
    for( int i = 0;i<s.length();i++){
        char ch = s.charAt(i);

        int num = (int)ch;
         num =  num-96;

        if( num > 9){
             sum += sumOfNumber(num);
        }else{
              sum += num;

        }
    }
    endSum = sum;

    while(k >1){
        endSum  = sumOfNumber(endSum);
        k--;
    }

     return endSum;


    }
}