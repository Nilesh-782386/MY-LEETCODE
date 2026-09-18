class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {

       int ans[] = new int[arr.length-k+1];

     Deque<Integer>dq  = new ArrayDeque<>();

     int  i = 0 , j = 0;

     while (j  < arr.length) {

      while (!dq.isEmpty() &&  arr[dq.peekLast()] <= arr[j]) {
        dq.removeLast();
      }
        dq.add(j);

       
         while(!dq.isEmpty()  &&  dq.peekFirst() <  i ) {
         dq.removeFirst();
        }

       if(j-i+1 == k ){
       ans[i] =  arr[dq.peekFirst()];
       i++;
       }

       j++;

       
     }
     return ans;

    }
}