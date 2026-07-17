class Solution {

    int gcd( int x ,int y ){
        if( x == 0 ) return y;

        return gcd(y%x , x);
    }
    public long gcdSum(int[] nums) {

        int max = 0;
    int ps[] = new int[nums.length];


    for(int i = 0;i<nums.length;i++){
        max = Math.max( max , nums[i]);
        ps[i] = gcd(max, nums[i]);
    }


    Arrays.sort(ps);
    int  i = 0;
    int  j = ps.length-1;

    long sum = 0;
    while( i < j ){
        sum += gcd( ps[i] , ps[j]);
        i++;
        j--;
    
    }
    return sum;
    }
}