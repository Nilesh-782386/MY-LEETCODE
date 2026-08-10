class Solution {
    public int[] numberGame(int[] arr) {
        
        int ans[]=  new  int[arr.length];

    PriorityQueue<Integer>pq = new PriorityQueue<>();
    for( int i   : arr){
        pq.add(i);
    }
    int  k = 0;

    while(!pq.isEmpty()){
        int p = pq.poll();
        int q = pq.poll();
        ans[k++] = q;
        ans[k++] = p;
    }
    return ans;
    }
}
