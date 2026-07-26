
class Solution {
  int min = Integer.MIN_VALUE;
  int d =   Integer.MIN_VALUE;

  Integer curr = null;


    public int maxProduct(int n) {

       while( n > 0){

         int prev = n%10;

    if(curr != null){

     min = Math.max( min , d*prev);
     
    }
      curr = prev;
      d = Math.max(d , curr);
     n = n/10;
       }

       return  min;
    }
}