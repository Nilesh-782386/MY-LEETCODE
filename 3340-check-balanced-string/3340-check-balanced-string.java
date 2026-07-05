class Solution {
    public boolean isBalanced(String num) {
        

    //  int sumEvenOdd = 0;
    int even  = 0;
    int odd  = 0;

     for( int i = 0;i<num.length();i++){
        
char ch  = num.charAt(i);

int  n = ch-'0';

if( (i%2) == 0 ){
  even += n;
}else{
    odd  += n;
}
     }
     return (odd == even);
    }
}