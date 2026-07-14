class Solution {
    public int GCD( int x  , int y){
        if(  x == 0 ) return y;


        return GCD(y%x , x);
    }
    public int findGCD(int[] nums) {

        int   max  = Integer.MIN_VALUE; 
        int  min = Integer.MAX_VALUE; 


        for( int i : nums){
            max  = Math.max( max , i );
            min = Math.min(min , i);
        }


        return GCD(min , max);

    }
}