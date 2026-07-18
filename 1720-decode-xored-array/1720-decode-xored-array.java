class Solution {
    public int[] decode(int[] arr, int first) {
        
        int ans[]  = new int[arr.length+1];
        ans[0] = first;
        for( int i = 0;i<arr.length;i++){

           ans[i+1] = ans[i]^arr[i];
            
        }

        return ans;
    } 


}