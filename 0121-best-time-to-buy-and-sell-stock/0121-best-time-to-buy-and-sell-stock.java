class Solution {
    public int maxProfit(int[] arr) {
       Stack<Integer>s = new Stack<>();
       int mx  = 0;
       int c =0;
for( int i =0; i<arr.length;i++){
    if(s.size() == 0 ){
        s.push(arr[i]);
    }else{
        if(s.peek()  > arr[i]){
            s.push(arr[i]);
        }else{
            c = arr[i]-s.peek();
            mx = Math.max(mx , c);
        }
    }
}
return mx;
    }
}