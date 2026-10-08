class Solution {
    public int threeSumClosest(int[] arr, int tar) {
        int n = arr.length;

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        int ans = 0;
        for( int i = 0; i<n;i++){
            
            int st = i+1;
            int end = n-1;


            while( st  < end ){

                int a = arr[st];
                int b = arr[i];
                int c = arr[end];

                int sum = a+b+c;
                int dif = Math.abs(sum-tar);

                if( dif < min){
                    min= dif;
                    ans= sum;
                }
                


                if( sum < tar  ){
                    st++;
                }else{
                    end--;
                }
            }
        }
        return ans;
     
    }
}