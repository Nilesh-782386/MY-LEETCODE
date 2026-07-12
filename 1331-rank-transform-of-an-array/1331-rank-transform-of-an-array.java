class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
     int n  = arr.length;

     int ans[] = new int[n];


     for(int i = 0; i<n;i++){
        ans[i] = arr[i];
     }
     Arrays.sort(ans);

     HashMap<Integer,Integer>h = new HashMap<>();
     int k = 1;
     for(int i : ans){
        if(!h.containsKey(i)){
            h.put(i,k++);
        }
     }

     for(int i = 0;i<n;i++){
         ans[i] = h.get(arr[i]);
     }
     return ans;
    }
}