class Solution {
    public int[] replaceElements(int[] arr) {

     int ans[] = new int[arr.length];
     Stack<Integer>s  = new Stack<>();
     s.push(arr[arr.length-1]);
     ans[arr.length-1] = -1;
     for( int i = arr.length-2;i>=0 ;i--){

if(s.size() > 0 && arr[i] > s.peek()){
    ans[i] = s.pop();
    s.push(arr[i]);
}else{
    ans[i] = s.peek(); 
}
     }

    return ans;
    }
}